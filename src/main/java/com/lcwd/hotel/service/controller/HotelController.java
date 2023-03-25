package com.lcwd.hotel.service.controller;

import com.lcwd.hotel.service.entity.Hotel;
import com.lcwd.hotel.service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel newHotel = hotelService.create(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(newHotel);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId){
        Hotel hotel = hotelService.getHotelById(hotelId);

        return ResponseEntity.status(HttpStatus.OK).body(hotel);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> createHotel(){
        List<Hotel> allHotel = hotelService.getAllHotel();
        return ResponseEntity.status(HttpStatus.OK).body(allHotel);
    }
}
