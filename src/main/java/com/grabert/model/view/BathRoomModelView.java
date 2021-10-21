package com.grabert.model.view;

import com.graebert.entity.Property;

public class BathRoomModelView {

	private Integer bathRoomId;

	//private Property PropertId;

	private Double bathRoomLength;

	private Double bathRoomWidth;

	private Double bathRoomArea;

	public Integer getBathRoomId() {
		return bathRoomId;
	}

	public void setBathRoomId(Integer bathRoomId) {
		this.bathRoomId = bathRoomId;
	}

	/*public Property getPropertId() {
		return PropertId;
	}

	public void setPropertId(Property propertId) {
		PropertId = propertId;
	}*/

	public Double getBathRoomLength() {
		return bathRoomLength;
	}

	public void setBathRoomLength(Double bathRoomLength) {
		this.bathRoomLength = bathRoomLength;
	}

	public Double getBathRoomWidth() {
		return bathRoomWidth;
	}

	public void setBathRoomWidth(Double bathRoomWidth) {
		this.bathRoomWidth = bathRoomWidth;
	}

	public Double getBathRoomArea() {
		return bathRoomArea;
	}

	public void setBathRoomArea(Double bathRoomArea) {
		this.bathRoomArea = bathRoomArea;
	}

}
