package com.jetsetter.service;

import com.jetsetter.model.City;
import com.jetsetter.model.Country;
import com.jetsetter.respository.CityRepository;
import com.jetsetter.respository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

@Service
public class CityServiceImpl implements CityService{

    @Autowired(required = true)
    private CityRepository cityRepository;


    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void delete(String id) {
        cityRepository.delete(id);
    }

    @Override
    public City findOne(String id) {
        return cityRepository.findOne(id);
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public List<City> findByCode(String code) {
        return null;
    }
}
