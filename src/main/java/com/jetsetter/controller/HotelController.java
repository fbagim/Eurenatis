package com.jetsetter.controller;

import com.jetsetter.model.Country;
import com.jetsetter.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */
@RestController
@RequestMapping("/jetsetter/api")
public class HotelController {
    @Autowired
    CountryService countryService;

    // -------------------Retrieve all students --------------------------------------------

    @RequestMapping(value = "/country/", method = RequestMethod.GET)

    public ResponseEntity getAllCountry() {
        List<Country> allCountry = countryService.findAll();
        if (allCountry.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Country>>(allCountry, HttpStatus.OK);
    }

}
