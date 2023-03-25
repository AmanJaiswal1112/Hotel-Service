package com.lcwd.hotel.service.service.impl;

import com.lcwd.hotel.service.entity.Hotel;
import com.lcwd.hotel.service.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.service.repository.HotelRepository;
import com.lcwd.hotel.service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public Hotel create(Hotel hotel){
        String hotelId = UUID.randomUUID().toString();
        hotel.setHotelId(hotelId);
        return hotelRepository.save(hotel);
    }

    public List<Hotel> getAllHotel(){
        return hotelRepository.findAll();
    }

    public Hotel getHotelById(String hotelId){
        return hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("Hotel not found "+hotelId));
    }

}
