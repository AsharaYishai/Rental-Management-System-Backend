package org.rms.service;

import org.rms.dto.Rental;

import java.util.List;

public interface RentalService {
    void addRental(Rental rental);

    List<Rental> getAllRental();

    void deleteRentalrById(Long id);

    void updateRental(Rental rental);
}
