package com.interview.service.impl;

import com.interview.entity.Car;
import com.interview.entity.Cabrio;
import com.interview.service.CarService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("CabrioService")
public class CabrioServiceImpl implements CarService {

    @Override
    public Car produceCar() {
        return new Cabrio();
    }

}
