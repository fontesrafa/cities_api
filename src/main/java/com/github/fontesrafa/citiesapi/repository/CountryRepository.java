package com.github.fontesrafa.citiesapi.repository;

import com.github.fontesrafa.citiesapi.countries.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
