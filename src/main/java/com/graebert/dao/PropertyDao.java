package com.graebert.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.graebert.entity.Property;

@Repository
public interface PropertyDao extends CrudRepository<Property, Integer>,PropertyCustomeDao{



	

	
	
	

}
