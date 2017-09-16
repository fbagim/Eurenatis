package com.jetsetter.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import com.jetsetter.model.*;
import com.jetsetter.model.hotelbeds.HotelBedsAvailability;
import com.jetsetter.respository.CityRepository;
import com.jetsetter.respository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired(required = true)
    private HotelRepository hotelRepository;

    public String checkHotelAvailability(HotelBedsAvailability hotelBedsAvailability, String requestType) throws JsonProcessingException {
        String walletBalanceUrl = "http://testapi.hotelbeds.com/hotel-api/1.0/hotels";

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Type", "application/json");
        httpHeaders.set("Accept", "application/json");
        httpHeaders.set("Api-Key", "gfhpht2ffsfejd88g7pcnexe");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(hotelBedsAvailability);


        HttpEntity <String> httpEntity = new HttpEntity <String> (json, httpHeaders);

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.postForObject(walletBalanceUrl, httpEntity, String.class);

        return response;
    }
}
