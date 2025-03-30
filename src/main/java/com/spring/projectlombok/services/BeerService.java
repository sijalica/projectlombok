package com.spring.projectlombok.services;

import com.spring.projectlombok.model.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    List<Beer> listBeers();

    Beer getBeerById(UUID id);
}
