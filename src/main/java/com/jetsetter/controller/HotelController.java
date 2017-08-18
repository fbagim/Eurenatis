package com.jetsetter.controller;

import com.jetsetter.model.Country;
import com.jetsetter.model.Hotel;
import com.jetsetter.service.CountryService;
import com.jetsetter.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */
@RestController
@RequestMapping("/jetsetter/api/hotel")

public class HotelController {
    @Autowired
    HotelService hotelService;

    // -------------------Retrieve all students --------------------------------------------

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getAllHotelsByCountry(@RequestParam String countryCode) {
        List<Hotel> allHotels = hotelService.findByCountryCode(countryCode);
        if (allHotels.isEmpty()) {
            return new ResponseEntity<List<Country>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Hotel>>(allHotels, HttpStatus.OK);
    }

    @RequestMapping(value = "/{hotelCode}", method = RequestMethod.GET)
    public ResponseEntity getHotel(@PathVariable String hotelCode) {
        Hotel hotelRes = hotelService.findOne(hotelCode);

        if (hotelRes == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(hotelRes, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity addHotel(@RequestBody Hotel hotel) {
        Hotel hotel1Res = hotelService.save(hotel);
        if (hotel1Res == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Hotel>(hotel1Res, HttpStatus.OK);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ResponseEntity addAllHotels(@RequestBody List<Hotel> hotels) {
        List<Hotel> hotel1Res = hotelService.addList(hotels);
        if (hotel1Res == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Hotel>>(hotel1Res, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public ResponseEntity updateCountry(Hotel hotel) {
//        List<Hotel> allCountry = hotelService.save(hotel);
//        if (allCountry.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<Country>>(allCountry, HttpStatus.OK);
        return null;
    }

    @RequestMapping(value = "/{countryCode}", method = RequestMethod.DELETE)
    public ResponseEntity deleteHotel(@PathVariable String id) {
        hotelService.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
}
