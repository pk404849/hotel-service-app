package com.hotel.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.app.entity.Hotel;
import com.hotel.app.repository.HotelRepository;
import com.hotel.app.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel saveHotel(Hotel hotel) {
		
		
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> findAllHotel() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel findByHotelId(Integer hotelId) {
		Optional<Hotel> findById = hotelRepository.findById(hotelId);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}
}
