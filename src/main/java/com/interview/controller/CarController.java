package com.interview.controller;

import com.interview.advice.InvalidInputException;
import com.interview.constant.CarConstants;
import com.interview.entity.Car;
import com.interview.constant.ApiConstants;
import com.interview.service.CarService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiConstants.CAR_PATH)
public class CarController {

    private final CarService cabrioService;
    private final CarService sedanService;
    private final CarService hatchbackService;

    public CarController(@Qualifier("CabrioService") CarService cabrioService, @Qualifier("SedanService") CarService sedanService, @Qualifier("HatchbackService") CarService hatchbackService) {
        this.cabrioService = cabrioService;
        this.sedanService = sedanService;
        this.hatchbackService = hatchbackService;
    }

    @RequestMapping(method = RequestMethod.POST)
    @Operation(summary = "Create car", description = "Create car by car type")
    public ResponseEntity<String> createCar(@Parameter(
            name =  "carType",
            example = "Sedan, Hatchback, Cabrio",
            required = true) @RequestParam String carType) throws InvalidInputException {
        Car car;
        if(CarConstants.SEDAN_TYPE.equals(carType)) {
            car = sedanService.produceCar();
        }else if(CarConstants.CABRIO_TYPE.equals(carType)) {
            car = cabrioService.produceCar();
        }else if(CarConstants.HATCHBACK_TYPE.equals(carType)) {
            car = hatchbackService.produceCar();
        }else {
            throw new InvalidInputException("Wrong car type! Type="+ carType);
        }

        return ResponseEntity.ok(car.getType() + " Car has produced.");
    }
}
