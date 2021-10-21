package com.graebert.model;

import com.graebert.entity.Property;

public class BedRoomModel {
	private Integer Id;

	private Property PropertId;

	private Double length;

	private Double width;

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
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

}
