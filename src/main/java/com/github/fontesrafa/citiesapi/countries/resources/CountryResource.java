package com.github.fontesrafa.citiesapi.countries.resources;

import java.util.List;

import com.github.fontesrafa.citiesapi.countries.entities.Country;
import com.github.fontesrafa.citiesapi.countries.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public List<Country> countries() {
        return repository.findAll();
    }
}
