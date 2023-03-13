package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {


    private CarDTO car;


    @GetMapping("/cars")
    public CarDTO getNewCar() {

        return car;
    }
    @PostMapping("/cars")
    public ResponseEntity newcar(@RequestBody CarDTO car){
        System.out.println("Car created: " + car.toString());
        this.car=car;
        return new ResponseEntity(HttpStatus.CREATED);
    }



}
