package com.hotel.app.converter;

import java.util.ArrayList;
import java.util.List;

import com.hotel.app.entity.Hotel;
import com.hotel.app.model.HotelModel;

public class ApiConverter {

	public static Hotel getHotelJpaObject(HotelModel hotelModel) {
		Hotel hotel = null;
		if (hotelModel != null) {
			hotel = new Hotel();
			hotel.setHotelId(hotelModel.getHotelId());
			hotel.setName(hotelModel.getName());
			hotel.setLocation(hotelModel.getLocation());
			hotel.setAbout(hotelModel.getAbout());
		}
		return hotel;
	}

	public static List<HotelModel> getHotelModelListObject(List<Hotel> hotelList) {
		List<HotelModel> hotelModelList = null;
		if (hotelList != null && !hotelList.isEmpty()) {
			hotelModelList = new ArrayList<>();
			for (Hotel hotel : hotelList) {
				hotelModelList.add(getHotelModelObject(hotel));
			}
		}
		return hotelModelList;
	}

	public static HotelModel getHotelModelObject(Hotel hotel) {
		HotelModel hotelModel = null;
		if (hotel != null) {
			hotelModel = new HotelModel();
			hotelModel.setHotelId(hotel.getHotelId());
			hotelModel.setName(hotel.getName());
			hotelModel.setLocation(hotel.getLocation());
			hotelModel.setAbout(hotel.getAbout());
		}
		return hotelModel;
	}

}
