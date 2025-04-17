package com.spring.projectlombok.mappers;

import com.spring.projectlombok.entities.Beer;
import com.spring.projectlombok.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
