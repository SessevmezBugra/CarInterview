package com.interview.service.impl;

import com.interview.entity.Car;
import com.interview.entity.Hatchback;
import com.interview.service.CarService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("HatchbackService")
public class HatchbackServiceImpl implements CarService {
    @Override
    public Car produceCar() {
        return new Hatchback();
    }
}
