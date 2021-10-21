package com.graebert.dao;

import java.util.List;

import com.graebert.entity.Property;

public interface PropertyCustomeDao{
	public List<Property> findAllPropertyByPropertyprice(double price);
	public List<Property> bedroomAndArea(Integer bedroom, Double minimumArea);
	public List<Property> bathroomAndArea(Integer bathroom, Double minimumArea);
	public List<Property> getPropertyByReqminimumArea(Double minimumArea);
	
	

}
