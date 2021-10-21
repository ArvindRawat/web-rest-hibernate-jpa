package com.grabert.model.view;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PropertyModelView {

	private Integer propertyId;

	private String bedRoom;

	private String bathRoom;

	private Double totalArea;

	private Double propertyprice;

	private List<BedRoomModelView> bedRoomDetail = new ArrayList<BedRoomModelView>();

	private List<BathRoomModelView> bathRoomDetail = new ArrayList<BathRoomModelView>();;

	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public String getBedRoom() {
		return bedRoom;
	}

	public void setBedRoom(String bedRoom) {
		this.bedRoom = bedRoom;
	}

	public String getBathRoom() {
		return bathRoom;
	}

	public void setBathRoom(String bathRoom) {
		this.bathRoom = bathRoom;
	}

	public Double getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(Double totalArea) {
		this.totalArea = totalArea;
	}

	public Double getPropertyprice() {
		return propertyprice;
	}

	public void setPropertyprice(Double propertyprice) {
		this.propertyprice = propertyprice;
	}

	public List<BedRoomModelView> getBedRoomDetail() {
		return bedRoomDetail;
	}

	public void setBedRoomDetail(List<BedRoomModelView> bedRoomDetail) {
		this.bedRoomDetail = bedRoomDetail;
	}

	public List<BathRoomModelView> getBathRoomDetail() {
		return bathRoomDetail;
	}

	public void setBathRoomDetail(List<BathRoomModelView> bathRoomDetail) {
		this.bathRoomDetail = bathRoomDetail;
	}

	

}
