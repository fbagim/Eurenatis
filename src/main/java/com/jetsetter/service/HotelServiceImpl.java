package com.jetsetter.service;

import com.jetsetter.model.Country;
import com.jetsetter.model.Hotel;
import com.jetsetter.respository.CountryRepository;
import com.jetsetter.respository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired(required = true)
    private HotelRepository hotelRepository;

    public HotelRepository getHotelRepository() {
        return hotelRepository;
    }

    public void setHotelRepository(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override

    public Hotel save(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public void delete(String id) {
        hotelRepository.delete(id);
    }

    @Override
    public Hotel findOne(String id) {
        return hotelRepository.findOne(id);
    }

    @Override
    public List<Hotel> findAll() {
        return  hotelRepository.findAll();
    }

    @Override
    public List<Hotel> addList(List<Hotel> hotels) {
        return hotelRepository.save(hotels);
    }


    @Override
    public List<Hotel> findByCountryCode(String code) {
        return hotelRepository.findByCountryCode(code);
    }

    @Override
    public List<Hotel> findByHotelCodeAndCountryCode(String hotelCode, String countryCode) {
        return  hotelRepository.findByHotelCodeAndCountryCode(hotelCode,countryCode);
    }

    @Override
    public List<Hotel> findByCityCodeAndCountryCode(int cityCode, String countryCode) {
        return hotelRepository.findByCityCodeAndCountryCode(cityCode, countryCode);
    }


}
