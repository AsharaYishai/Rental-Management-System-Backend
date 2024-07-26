package org.rms.service;

import org.rms.dto.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);

    List<Customer> getAllCustomer();

    void deleteCustomerById(Long id);
}
