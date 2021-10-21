package com.graebert.service.impl;

import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grabert.model.view.BathRoomModelView;
import com.grabert.model.view.BedRoomModelView;
import com.grabert.model.view.PropertyModelView;
import com.graebert.dao.PropertyDao;
import com.graebert.entity.BathRoom;
import com.graebert.entity.BedRoom;
import com.graebert.entity.Property;
import com.graebert.model.PropertyModel;
import com.graebert.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	ModelMapper mapper;

	@Autowired
	PropertyDao propertyDao;

	@Override
	public PropertyModelView saveProperty(PropertyModel propertyModel) {
		Property property = mapper.map(propertyModel, Property.class);
		double totalBedRoomArea = 0.00;
		double totalBathRoomArea = 0.00;
		for (BedRoom bedRoomObj : property.getBedRoomDetail()) {
			double bedRoomArea = bedRoomObj.getLength() * bedRoomObj.getWidth();
			bedRoomObj.setArea(bedRoomArea);
			totalBedRoomArea += totalBedRoomArea + bedRoomArea;
			bedRoomObj.setPropertId(property);
		}

		for (BathRoom bathroomObj : property.getBathRoomDetail()) {
			bathroomObj.setPropertId(property);
			double bathRoomArea = bathroomObj.getLength() * bathroomObj.getWidth();
			bathroomObj.setArea(bathRoomArea);
			totalBathRoomArea = +totalBathRoomArea + bathRoomArea;
		}
		property.setTotalArea(totalBedRoomArea + totalBathRoomArea);
		Property propertyObj = propertyDao.save(property);

		PropertyModelView propertyModelView = mapper.map(propertyObj, PropertyModelView.class);

		for (BedRoom bedRoom : propertyObj.getBedRoomDetail()) {
			BedRoomModelView bedRoomView = new BedRoomModelView();
			bedRoomView.setBedRoomArea(bedRoom.getArea());
			bedRoomView.setBedRoomId(bedRoom.getId());
			bedRoomView.setBedRoomLength(bedRoom.getLength());
			bedRoomView.setBedRoomWidth(bedRoom.getWidth());
		}
		for (BathRoom bathRoom : propertyObj.getBathRoomDetail()) {
			BathRoomModelView bathRoomView = new BathRoomModelView();
			bathRoomView.setBathRoomArea(bathRoom.getArea());
			bathRoomView.setBathRoomId(bathRoom.getId());
			bathRoomView.setBathRoomLength(bathRoom.getLength());
			bathRoomView.setBathRoomWidth(bathRoom.getWidth());
		}

		return propertyModelView;
	}

	@Override
	public List<PropertyModelView> getPropertyByPropertyprice(Double price) {
		List<Property> properties = propertyDao.findAllPropertyByPropertyprice(price);
		List<PropertyModelView> modelAndViews = null;
		if (properties.size() > 0) {
			PropertyModelView[] modelAndViewsArray = mapper.map(properties, PropertyModelView[].class);
			modelAndViews = Arrays.asList(modelAndViewsArray);

		}
		return modelAndViews;
	}

	@Override
	public List<PropertyModelView> bedroomAndArea(Integer bedroom, Double minimumArea) {
		List<Property> properties = propertyDao.bedroomAndArea(bedroom, minimumArea);
		List<PropertyModelView> modelAndViews = null;
		if (properties.size() > 0) {
			PropertyModelView[] modelAndViewsArray = mapper.map(properties, PropertyModelView[].class);
			modelAndViews = Arrays.asList(modelAndViewsArray);

		}
		return modelAndViews;

	}

	@Override
	public List<PropertyModelView> bathroomAndArea(Integer bathroom, Double minimumArea) {
		List<Property> properties = propertyDao.bathroomAndArea(bathroom, minimumArea);
		List<PropertyModelView> modelAndViews = null;
		if (properties.size() > 0) {
			PropertyModelView[] modelAndViewsArray = mapper.map(properties, PropertyModelView[].class);
			modelAndViews = Arrays.asList(modelAndViewsArray);

		}
		return modelAndViews;

	}

	@Override
	public List<PropertyModelView> getPropertyByReqminimumArea(Double minimumArea) {
		List<Property> properties = propertyDao.getPropertyByReqminimumArea(minimumArea);
		List<PropertyModelView> modelAndViews = null;
		if (properties.size() > 0) {
			PropertyModelView[] modelAndViewsArray = mapper.map(properties, PropertyModelView[].class);
			modelAndViews = Arrays.asList(modelAndViewsArray);

		}
		return modelAndViews;
	}
}
