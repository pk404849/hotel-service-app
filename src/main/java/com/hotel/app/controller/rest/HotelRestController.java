package com.hotel.app.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.converter.ApiConverter;
import com.hotel.app.entity.Hotel;
import com.hotel.app.model.HotelModel;
import com.hotel.app.service.HotelService;

@RestController
@RequestMapping(value = "/hotel")
public class HotelRestController {

	@Autowired
	private HotelService hotelService;

	@PostMapping(value = "/save-hotel")
	public ResponseEntity<?> saveHotel(@RequestBody HotelModel hotelModel) {

		Hotel hotel = ApiConverter.getHotelJpaObject(hotelModel);
		hotelService.saveHotel(hotel);
		String message = "Hotel saved successfully";
		return ResponseEntity.ok(message);
	}

	@GetMapping(value = "/find-all-hotel")
	public ResponseEntity<?> findAllHOtel() {
		List<Hotel> hotelList = hotelService.findAllHotel();
		List<HotelModel> hotelModelIst = ApiConverter.getHotelModelListObject(hotelList);
		return ResponseEntity.ok(hotelModelIst);
	}

	@GetMapping(value = "/find-by-hotel-id/{hotelId}")
	public ResponseEntity<?> findByHotelId(@PathVariable(name = "hotelId") Integer hotelId) {
		Hotel hotel = hotelService.findByHotelId(hotelId);
		HotelModel hotelModel = ApiConverter.getHotelModelObject(hotel);
		return ResponseEntity.ok(hotelModel);
	}
}
