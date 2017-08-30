package com.jetsetter.controller;

import com.jetsetter.model.City;
import com.jetsetter.model.Country;
import com.jetsetter.service.CityService;
import com.jetsetter.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

@RestController
@RequestMapping("/jetsetter/api/city")
public class CityController {
    @Autowired
    CityService cityService;

    // -------------------Retrieve all students --------------------------------------------

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity getAllCities() {
        List<City> allCities= cityService.findAll();
        if (allCities.isEmpty()) {
            return new ResponseEntity<List<City>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<City>>(allCities, HttpStatus.OK);
    }

    @RequestMapping(value = "/{zipCode}", method = RequestMethod.GET)
    public ResponseEntity getCity(@PathVariable String zipCode) {
        City city = cityService.findOne(zipCode);
        if (city == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(city, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity getCityByCountry(@RequestParam String countryCode) {
        List<City> cities=cityService.findByCountryCode(countryCode);
        if (cities == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(cities, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity addCity(@RequestBody City city) {
        City cityRes = cityService.save(city);
        if (cityRes == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<City>(cityRes, HttpStatus.OK);
    }
    @RequestMapping(value = "/all", method = RequestMethod.PUT)
    public ResponseEntity addCity(@RequestBody  List<City> cities) {
         cityService.save(cities);
        return new ResponseEntity<List<City>>(cities, HttpStatus.OK);
    }

    @RequestMapping(value = "/city", method = RequestMethod.PUT)
    public ResponseEntity updateCity(City city) {
        List<City> allCity = cityService.findAll();
        if (allCity.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<City>>(allCity, HttpStatus.OK);
    }

    @RequestMapping(value = "/city/{zipCode}", method = RequestMethod.DELETE)
    public ResponseEntity deleteCountry(@PathVariable String zipCode) {
        cityService.delete(zipCode);
        return new ResponseEntity(zipCode, HttpStatus.OK);
    }
}
