package org.rms.controller;

import lombok.RequiredArgsConstructor;
import org.rms.dto.HardwareItem;
import org.rms.service.HardwareItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item-controller")
@RequiredArgsConstructor
public class HardwareController {
    final HardwareItemService service;

    @PostMapping("/add-item")
    @ResponseStatus(HttpStatus.CREATED)
    public void addHardwareItem(@RequestBody HardwareItem hardwareItem){
        service.addHardwareItem(hardwareItem);
    }
}
