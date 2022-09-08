package com.develhope.Api5.serviceimpl;


import com.develhope.Api5.DTO.CarDTO;
import com.develhope.Api5.service.CarService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class CarServiceImpl implements CarService {

    @Override
    public ResponseEntity<CarDTO> createCarDTO(CarDTO carDTO) {
      return new ResponseEntity("created carDto success ",HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<CarDTO> readCarDto() {
        return ResponseEntity.status(HttpStatus.OK).body(new CarDTO("1","panda",123445.65));
    }
}
