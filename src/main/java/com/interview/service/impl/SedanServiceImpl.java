package com.interview.service.impl;

import com.interview.entity.Car;
import com.interview.entity.Sedan;
import com.interview.service.CarService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("SedanService")
public class SedanServiceImpl implements CarService {
    @Override
    public Car produceCar() {
        return new Sedan();
    }
}
