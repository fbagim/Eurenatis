package com.jetsetter.service;

import com.jetsetter.model.City;
import com.jetsetter.model.Country;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

public interface CityService {

    public City save(City city);

    public void save(List<City> cities);

    public void delete(String id);

    public City findOne(String id);

    public List<City>  findAll();

    public List<City> findByCountryCode(String code);

}
