package org.rms.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.rms.dto.Customer;
import org.rms.entity.CustomerEntity;
import org.rms.repository.CustomerRepository;
import org.rms.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    final CustomerRepository repository;
    @Override
    public void addCustomer(Customer customer) {
        repository.save(new ObjectMapper().convertValue(customer, CustomerEntity.class));
    }
}
