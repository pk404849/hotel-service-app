package com.hotel.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.app.entity.Hotel;

@Repository
public interface HotelRepository extends  JpaRepository<Hotel, Integer> {

}
