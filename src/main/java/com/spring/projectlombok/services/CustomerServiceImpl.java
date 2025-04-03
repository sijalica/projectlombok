package com.spring.projectlombok.services;

import com.spring.projectlombok.model.Customer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    private Map<UUID, Customer> customerMap;

    public CustomerServiceImpl() {
        Customer customer1 = Customer.builder()
                .id(UUID.randomUUID())
                .customerName("Customer 1")
                .version(1)
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        Customer customer2 = Customer.builder()
                .id(UUID.randomUUID())
                .customerName("Customer 2")
                .version(1)
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        Customer customer3 = Customer.builder()
                .id(UUID.randomUUID())
                .customerName("Customer 3")
                .version(1)
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        customerMap = new HashMap<>();
        customerMap.put(customer1.getId(), customer1);
        customerMap.put(customer2.getId(), customer2);
        customerMap.put(customer3.getId(), customer3);
    }
    @Override
    public List<Customer> getCustomers() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer getCustomer(UUID id) {
        return customerMap.get(id);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        Customer newCustomer = Customer.builder()
                .id(UUID.randomUUID())
                .customerName(customer.getCustomerName())
                .version(customer.getVersion())
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        customerMap.put(newCustomer.getId(), newCustomer);

        return newCustomer;
    }

    @Override
    public void updateCustomerById(UUID customerId, Customer customer) {
        Customer oldCustomer = customerMap.get(customerId);
        oldCustomer.setCustomerName(customer.getCustomerName());
        oldCustomer.setLastModifiedDate(LocalDateTime.now());
        oldCustomer.setVersion(customer.getVersion());
        oldCustomer.setCreatedDate(LocalDateTime.now());
        customerMap.put(customerId, oldCustomer);
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        customerMap.remove(customerId);
    }
}
