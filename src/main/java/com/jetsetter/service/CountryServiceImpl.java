package com.jetsetter.service;

import com.jetsetter.model.Country;
import com.jetsetter.respository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

@Service
public class CountryServiceImpl  implements CountryService{
    @Autowired(required = true)
    private CountryRepository countryRepository;

    public CountryRepository getCountryRepository() {
        return countryRepository;
    }

    public void setCountryRepository(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public void delete(String id) {
        countryRepository.delete(id);
    }

    @Override
    public Country findOne(String id) {
        return countryRepository.findOne(id);
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public List<Country> findByCode(String code) {
        return null;
    }
}
