package com.graebert.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PROPERTY")
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROPERTY_ID")
	private Integer propertyId;
	
	@Column(name = "BEDROOM")
	private Integer bedRoom;
	
	@Column(name = "BATHROOM")
	private Integer bathRoom;
	
	
	@Column(name = "TOTAL_AREA")
	private Double totalArea;
	
	@Column(name = "PROPERTY_PRICE")
	private Double propertyprice;
	

	@OneToMany(mappedBy = "PropertId", cascade = CascadeType.ALL)
	private List<BedRoom> bedRoomDetail;//= new ArrayList<BedRoom>();

	@OneToMany(mappedBy = "PropertId", cascade = CascadeType.ALL)
	private List<BathRoom> bathRoomDetail;

	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public Integer getBedRoom() {
		return bedRoom;
	}

	public void setBedRoom(Integer bedRoom) {
		this.bedRoom = bedRoom;
	}

	public Integer getBathRoom() {
		return bathRoom;
	}

	public void setBathRoom(Integer bathRoom) {
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

	public List<BedRoom> getBedRoomDetail() {
		return bedRoomDetail;
	}

	public void setBedRoomDetail(List<BedRoom> bedRoomDetail) {
		this.bedRoomDetail = bedRoomDetail;
	}

	public List<BathRoom> getBathRoomDetail() {
		return bathRoomDetail;
	}

	public void setBathRoomDetail(List<BathRoom> bathRoomDetail) {
		this.bathRoomDetail = bathRoomDetail;
	}
}

