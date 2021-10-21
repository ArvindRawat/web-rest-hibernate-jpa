package com.graebert.service;

import java.util.List;

import com.grabert.model.view.PropertyModelView;
import com.graebert.model.PropertyModel;

public interface PropertyService {

	public PropertyModelView saveProperty(PropertyModel propertyModel);

	public List<PropertyModelView> getPropertyByPropertyprice(Double price);

	public List<PropertyModelView> bedroomAndArea(Integer bedroom, Double minimumArea);

	public List<PropertyModelView> bathroomAndArea(Integer bathroom, Double minimumArea);

	public List<PropertyModelView> getPropertyByReqminimumArea(Double minimumArea);

}
