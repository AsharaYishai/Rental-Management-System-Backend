package org.rms.repository;

import org.rms.dto.HardwareItem;
import org.rms.entity.HardwareItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HardwareItemRepository extends JpaRepository<HardwareItemEntity, Long> {
}
