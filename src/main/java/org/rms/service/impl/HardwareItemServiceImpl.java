package org.rms.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.rms.dto.HardwareItem;
import org.rms.entity.HardwareItemEntity;
import org.rms.repository.HardwareItemRepository;
import org.rms.service.HardwareItemService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HardwareItemServiceImpl implements HardwareItemService {
    final HardwareItemRepository repository;
    @Override
    public void addHardwareItem(HardwareItem hardwareItem) {
        repository.save(new ObjectMapper().convertValue(hardwareItem, HardwareItemEntity.class));
    }
}
