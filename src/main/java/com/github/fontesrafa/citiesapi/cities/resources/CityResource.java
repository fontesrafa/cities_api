package com.github.fontesrafa.citiesapi.cities.resources;

import java.util.List;

import com.github.fontesrafa.citiesapi.cities.entities.City;
import com.github.fontesrafa.citiesapi.cities.repositories.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityRepository repository;

    @GetMapping
    public List<City> cities() {
        return repository.findAll();
    }
}
