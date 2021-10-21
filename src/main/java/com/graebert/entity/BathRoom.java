package com.graebert.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BATHROOM")
public class BathRoom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer Id;

	@ManyToOne
	@JoinColumn(name = "PROPERTY_ID")
	private Property PropertId;

	@Column(name = "LENGTH")
	private Double length;

	@Column(name = "WIDTH")
	private Double Width;

	@Column(name = "AREA")
	private Double area;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Property getPropertId() {
		return PropertId;
	}

	public void setPropertId(Property propertId) {
		PropertId = propertId;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return Width;
	}

	public void setWidth(Double width) {
		Width = width;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

}