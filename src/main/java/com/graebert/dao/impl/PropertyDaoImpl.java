package com.graebert.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.graebert.dao.PropertyCustomeDao;
import com.graebert.entity.Property;

@SuppressWarnings({ "deprecation", "unchecked" })
public class PropertyDaoImpl implements PropertyCustomeDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Property> findAllPropertyByPropertyprice(double price) {
		Session session = (Session) entityManager.getDelegate();
		Criteria crit = session.createCriteria(Property.class);
		crit.add(Restrictions.gt("propertyprice", price));
		List<Property> results = crit.list();
		return results;
	}

	@Override
	public List<Property> bedroomAndArea(Integer bedroom, Double minimumArea) {
		Session session = (Session) entityManager.getDelegate();
		Criteria crit = session.createCriteria(Property.class,"p");
		crit.createAlias("p.bedRoomDetail", "bed");
		crit.add(Restrictions.ge("bedRoom", bedroom)).add(Restrictions.ge("bed.area", minimumArea));
		List<Property> results = crit.list();
		return results;
	}

	@Override
	public List<Property> bathroomAndArea(Integer bathroom, Double minimumArea) {
		Session session = (Session) entityManager.getDelegate();
		Criteria crit = session.createCriteria(Property.class,"p");
		crit.createAlias("p.bathRoomDetail", "bath");
		crit.add(Restrictions.ge("bathRoom", bathroom)).add(Restrictions.ge("bath.area", minimumArea));
		List<Property> results = crit.list();
		return results;
	}

	@Override
	public List<Property> getPropertyByReqminimumArea(Double minimumArea) {
		Session session = (Session) entityManager.getDelegate();
		Criteria crit = session.createCriteria(Property.class);
		crit.add(Restrictions.gt("totalArea", minimumArea));
		List<Property> results = crit.list();
		return results;
	}

}
