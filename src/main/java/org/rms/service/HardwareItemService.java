package org.rms.service;

import org.rms.dto.HardwareItem;

import java.util.List;

public interface HardwareItemService {
    void addHardwareItem(HardwareItem hardwareItem);



    List<HardwareItem> getAllHardwareItem();



    void deleteItemById(Long id);

    void updateitem(HardwareItem hardwareItem);
}
