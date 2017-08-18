package com.jetsetter.service;

import com.jetsetter.model.Country;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

public interface CountryService {
    public Country save(Country country);

    public void save(List<Country> countries);

    public void delete(String id);

    public Country findOne(String id);

    public List<Country>  findAll();

    public List<Country> findByCode(String code);

}
