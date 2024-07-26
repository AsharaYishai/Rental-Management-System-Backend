package org.rms.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.rms.dto.Customer;
import org.rms.entity.CustomerEntity;
import org.rms.repository.CustomerRepository;
import org.rms.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    final CustomerRepository repository;
    @Override
    public void addCustomer(Customer customer) {
        repository.save(new ObjectMapper().convertValue(customer, CustomerEntity.class));
    }

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        List<CustomerEntity> allCustomerEntityList = repository.findAll();
        allCustomerEntityList.forEach(entity->{
            customerList.add(new ObjectMapper().convertValue(entity,Customer.class));
        });
        return customerList;
    }

    @Override
    public void deleteCustomerById(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
        }
    }

    @Override
    public void updateCustomer(Customer customer) {
        if(repository.findById(customer.getCustomerId()).isPresent()){
            repository.save(new ObjectMapper().convertValue(customer,CustomerEntity.class));
        }
    }
}
