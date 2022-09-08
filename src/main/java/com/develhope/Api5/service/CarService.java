package com.develhope.Api5.service;


import com.develhope.Api5.DTO.CarDTO;
import org.springframework.http.ResponseEntity;


public interface CarService {

    ResponseEntity<CarDTO> createCarDTO(CarDTO carDTO);

    ResponseEntity<CarDTO> readCarDto();


}
