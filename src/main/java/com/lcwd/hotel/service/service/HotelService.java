package com.lcwd.hotel.service.service;

import com.lcwd.hotel.service.entity.Hotel;

import java.util.List;

public interface HotelService {

    public Hotel create(Hotel hotel);
    public List<Hotel> getAllHotel();
    public Hotel getHotelById(String hotelId);
}
