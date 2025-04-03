package com.spring.projectlombok.services;

import com.spring.projectlombok.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    List<Customer> getCustomers();
    Customer getCustomer(UUID id);

    Customer createCustomer(Customer customer);

    void updateCustomerById(UUID customerId, Customer customer);

    void deleteCustomerById(UUID customerId);
}
