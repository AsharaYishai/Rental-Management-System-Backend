package org.rms.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.rms.dto.Rental;
import org.rms.entity.RentalEntity;
import org.rms.repository.RentalRepository;
import org.rms.service.RentalService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    final RentalRepository repository;
    @Override
    public void addRental(Rental rental) {
        repository.save(new ObjectMapper().convertValue(rental, RentalEntity.class));
    }
}
