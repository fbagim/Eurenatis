package com.jetsetter.controller;

import com.jetsetter.model.Country;
import com.jetsetter.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */
@RestController
@RequestMapping("/jetsetter/api/country")

public class CountryController {
    @Autowired
    CountryService countryService;

    // -------------------Retrieve all students --------------------------------------------

    @RequestMapping(value = "/", method = RequestMethod.GET)

    public ResponseEntity getAllCountry() {
        List<Country> allCountry = countryService.findAll();
        if (allCountry.isEmpty()) {
            return new ResponseEntity<List<Country>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Country>>(allCountry, HttpStatus.OK);
    }

    @RequestMapping(value = "/{countryCode}", method = RequestMethod.GET)
    public ResponseEntity getCountry(@PathVariable String countryCode) {
        Country country = countryService.findOne(countryCode);
        if (country == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(country, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity addCountry(@RequestBody Country country) {
        Country countryRes = countryService.save(country);
        if (countryRes == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Country>(countryRes, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public ResponseEntity updateCountry(Country country) {
        List<Country> allCountry = countryService.findAll();
        if (allCountry.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Country>>(allCountry, HttpStatus.OK);
    }

    @RequestMapping(value = "/{countryCode}", method = RequestMethod.DELETE)
    public ResponseEntity deleteCountry(@PathVariable String id) {
        countryService.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
}
