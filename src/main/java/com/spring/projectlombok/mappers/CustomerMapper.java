package com.spring.projectlombok.mappers;

import com.spring.projectlombok.entities.Customer;
import com.spring.projectlombok.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
