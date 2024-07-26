package org.rms.controller;

import lombok.RequiredArgsConstructor;
import org.rms.dto.HardwareItem;
import org.rms.service.HardwareItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/get-all-item")
    public List<HardwareItem> getAllItem(){
        return service.getAllHardwareItem();
    }

    @DeleteMapping("/delete-item/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String deleteItem(@PathVariable Long id){
        service.deleteItemById(id);
        return "Deleted";
    }

    @PutMapping("/update-item")
    public void updateItem(@RequestBody HardwareItem hardwareItem){
        service.updateitem(hardwareItem);
    }

}
