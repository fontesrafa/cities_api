package com.github.fontesrafa.citiesapi.states.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.fontesrafa.citiesapi.states.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
    
}