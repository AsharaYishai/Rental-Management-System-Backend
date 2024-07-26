package org.rms.controller;

import lombok.RequiredArgsConstructor;
import org.rms.dto.Customer;
import org.rms.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer-controller")
@RequiredArgsConstructor
public class CustomerController {
    final CustomerService service;

    @PostMapping("/add-customer")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }

    @GetMapping("/get-all-customer")
    public List<Customer> getAllCustomer(){
        return service.getAllCustomer();
    }

    @DeleteMapping("/delete-customer/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String deleteCustomer(@PathVariable Long id){
        service.deleteCustomerById(id);
        return "Deleted";
    }

    @PutMapping("/update-customer")
    public void updateCustomer(@RequestBody Customer customer){
        service.updateCustomer(customer);
    }


}
