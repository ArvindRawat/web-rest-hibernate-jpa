package com.graebert.model;

import java.util.List;


public class PropertyModel {

	private Integer propertyId;

	private String bedRoom;

	private String bathRoom;

	private Double totalArea;

	private Double propertyprice;

	private List<BedRoomModel> bedRoomDetail;

	private List<BathRoomModel> bathRoomDetail;

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

	public List<BedRoomModel> getBedRoomDetail() {
		return bedRoomDetail;
	}

	public void setBedRoomDetail(List<BedRoomModel> bedRoomDetail) {
		this.bedRoomDetail = bedRoomDetail;
	}

	public List<BathRoomModel> getBathRoomDetail() {
		return bathRoomDetail;
	}

	public void setBathRoomDetail(List<BathRoomModel> bathRoomDetail) {
		this.bathRoomDetail = bathRoomDetail;
	}
}
