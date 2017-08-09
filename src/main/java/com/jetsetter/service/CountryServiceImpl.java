package com.jetsetter.service;

import com.jetsetter.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

@Service
public class CountryServiceImpl implements CountryService {
    private CountryService countryService;

    @Autowired
    public void setCountryService(CountryService countryService) {
        this.countryService = countryService;
    }

    @Override
    public Country save(Country book) {
        return null;
    }

    @Override
    public void delete(Country book) {

    }

    @Override
    public Country findOne(String id) {
        return null;
    }

    @Override
    public Iterable<Country> findAll() {
        return null;
    }

    @Override
    public List<Country> findByCode(String code) {
        return null;
    }
}
