package com.hotel.app.model;

import java.io.Serializable;

public class HotelModel implements Serializable{

	private static final long serialVersionUID = -5039036704805487774L;
	
	private Integer hotelId;
	private String name;
	private String location;
	private String about;

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

}
