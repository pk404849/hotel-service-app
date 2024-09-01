package com.hotel.app.service;

import java.util.List;

import com.hotel.app.entity.Hotel;

public interface HotelService {

	public Hotel saveHotel(Hotel hotel);
	
	public List<Hotel> findAllHotel();
	
	public Hotel findByHotelId(Integer hotelId);
	
}
