package com.interview.entity;

import com.interview.constant.CarConstants;

public class Sedan implements Car {
    @Override
    public String getType() {
        return CarConstants.SEDAN_TYPE;
    }
}
