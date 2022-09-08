package com.develhope.Api5.controller;


import com.develhope.Api5.DTO.CarDTO;
import com.develhope.Api5.serviceimpl.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarServiceImpl carService;


    @PostMapping
    public ResponseEntity<CarDTO> createCar(@RequestBody CarDTO carDTO) {
        return carService.createCarDTO(carDTO);
    }

    @GetMapping
    public ResponseEntity<CarDTO> readCarDto(){
        return carService.readCarDto();
    }
}
