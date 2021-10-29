package com.github.fontesrafa.citiesapi.countries.repositories;

import com.github.fontesrafa.citiesapi.countries.entities.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
