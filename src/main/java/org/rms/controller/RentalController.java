package org.rms.controller;

import lombok.RequiredArgsConstructor;
import org.rms.dto.Customer;
import org.rms.dto.Rental;
import org.rms.service.RentalService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rental-controller")
@RequiredArgsConstructor
public class RentalController {
    final RentalService service;

    @PostMapping("/add-rental")
    @ResponseStatus(HttpStatus.CREATED)
    public void addRental(@RequestBody Rental rental){
        service.addRental(rental);
    }

    @GetMapping("/get-all-rental")
    public List<Rental> getAllRental(){
        return service.getAllRental();
    }

    @DeleteMapping("/delete-rental/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String deleteRental(@PathVariable Long id){
        service.deleteRentalrById(id);
        return "Deleted";
    }
}
