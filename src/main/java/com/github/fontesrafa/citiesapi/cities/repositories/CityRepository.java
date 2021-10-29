package com.github.fontesrafa.citiesapi.cities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.fontesrafa.citiesapi.cities.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {
    
}
