package com.jetsetter.service;

import com.jetsetter.model.City;
import com.jetsetter.model.Hotel;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

public interface HotelService {


    public Hotel save(Hotel hotel);

    public void delete(String id);

    public Hotel findOne(String id);

    public List<Hotel>  findAll();

    public List<Hotel>  addList(List<Hotel> hotels);

    public List<Hotel> findByCountryCode(String code);

    public List<Hotel> findByHotelCodeAndCountryCode(String hotelCode, String countryCode);


}
