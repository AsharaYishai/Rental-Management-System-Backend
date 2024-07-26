package org.rms.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.rms.dto.HardwareItem;
import org.rms.entity.HardwareItemEntity;
import org.rms.repository.HardwareItemRepository;
import org.rms.service.HardwareItemService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HardwareItemServiceImpl implements HardwareItemService {
    final HardwareItemRepository repository;
    @Override
    public void addHardwareItem(HardwareItem hardwareItem) {
        repository.save(new ObjectMapper().convertValue(hardwareItem, HardwareItemEntity.class));
    }


    @Override
    public List<HardwareItem> getAllHardwareItem() {
        List<HardwareItem> hardwareItemList = new ArrayList<>();
        List<HardwareItemEntity> hardwareItemEntityList = repository.findAll();
        hardwareItemEntityList.forEach(entity->{
            hardwareItemList.add(new ObjectMapper().convertValue(entity, HardwareItem.class));
        });
        return hardwareItemList;
    }

    @Override
    public void deleteItemById(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
        }
    }

    @Override
    public void updateitem(HardwareItem hardwareItem) {
        if(repository.findById(hardwareItem.getItemId()).isPresent()){
            repository.save(new ObjectMapper().convertValue(hardwareItem, HardwareItemEntity.class));
        }
    }


}
