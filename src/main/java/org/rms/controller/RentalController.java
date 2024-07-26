package org.rms.controller;

import lombok.RequiredArgsConstructor;
import org.rms.dto.Rental;
import org.rms.service.RentalService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
}
