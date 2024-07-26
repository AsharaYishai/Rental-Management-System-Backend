package org.rms.repository;

import org.rms.entity.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<RentalEntity, Long> {
}
