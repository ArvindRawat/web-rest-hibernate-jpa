package com.graebert.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grabert.model.view.CustomResponseModelAndView;
import com.grabert.model.view.PropertyModelView;
import com.graebert.model.PropertyModel;
import com.graebert.service.PropertyService;

@RestController
@RequestMapping("/api/property")
public class PropertyRest {
	
	@Autowired
	PropertyService propertyService;
	
	
	@PostMapping(value = "/save")
	public ResponseEntity<PropertyModelView> saveProperty(@RequestBody PropertyModel propertyModel) {
		PropertyModelView propertyModelView=propertyService.saveProperty(propertyModel);
		return new ResponseEntity<PropertyModelView>(propertyModelView, HttpStatus.OK);
	}
	@GetMapping(value = "/price")
	public ResponseEntity<CustomResponseModelAndView> getPropertyByPrice(@RequestParam("price") Double price ){
		System.out.println("In getPropertyByPrice of rest..");
		List<PropertyModelView> propertyModelView=propertyService.getPropertyByPropertyprice(price);
		CustomResponseModelAndView customResponse=new CustomResponseModelAndView(propertyModelView);
		return new ResponseEntity<CustomResponseModelAndView>(customResponse,HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/bedroomandarea")
	public ResponseEntity<CustomResponseModelAndView> bedroomAndArea(@RequestParam("bedroom") Integer bedroom, @RequestParam("minimumArea") Double minimumArea){
		List<PropertyModelView> propertyModelView=propertyService.bedroomAndArea(bedroom,minimumArea);
		CustomResponseModelAndView customResponse=new CustomResponseModelAndView(propertyModelView);
		return new ResponseEntity<CustomResponseModelAndView>(customResponse,HttpStatus.OK);
		
	}
	
	
	@GetMapping(value = "/bathroomandarea")
	public ResponseEntity<CustomResponseModelAndView> bathroomAndArea(@RequestParam("bathroom") Integer bathroom, @RequestParam("minimumArea") Double minimumArea){
		List<PropertyModelView> propertyModelView=propertyService.bathroomAndArea(bathroom,minimumArea);
		CustomResponseModelAndView customResponse=new CustomResponseModelAndView(propertyModelView);
		return new ResponseEntity<CustomResponseModelAndView>(customResponse,HttpStatus.OK);
		
	}
	@GetMapping(value = "/totalminarea")
	public ResponseEntity<CustomResponseModelAndView> getPropertyByReqminimumArea(@RequestParam("totalMinimumArea") Double totalMinimumArea){
		List<PropertyModelView> propertyModelView=propertyService.getPropertyByReqminimumArea(totalMinimumArea);
		CustomResponseModelAndView customResponse=new CustomResponseModelAndView(propertyModelView);
		return new ResponseEntity<CustomResponseModelAndView>(customResponse,HttpStatus.OK);
		
	}

}
