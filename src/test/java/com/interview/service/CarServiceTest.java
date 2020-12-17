package com.interview.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.interview.constant.CarConstants;
import com.interview.entity.Car;
import com.interview.service.impl.CabrioServiceImpl;
import com.interview.service.impl.HatchbackServiceImpl;
import com.interview.service.impl.SedanServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {

    @InjectMocks
    CabrioServiceImpl cabrioService;

    @InjectMocks
    SedanServiceImpl sedanService;

    @InjectMocks
    HatchbackServiceImpl hatchbackService;

    @Test
    public void createCar_cabrio() {
        Car car = cabrioService.produceCar();
        assertEquals(car.getType(), CarConstants.CABRIO_TYPE);
    }

    @Test
    public void createCar_sedan() {
        Car car = sedanService.produceCar();
        assertEquals(car.getType(), CarConstants.SEDAN_TYPE);
    }

    @Test
    public void createCar_hatchback() {
        Car car = hatchbackService.produceCar();
        assertEquals(car.getType(), CarConstants.HATCHBACK_TYPE);
    }

}
