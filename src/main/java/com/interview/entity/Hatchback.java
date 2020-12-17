package com.interview.entity;

import com.interview.constant.CarConstants;

public class Hatchback implements Car {
    @Override
    public String getType() {
        return CarConstants.HATCHBACK_TYPE;
    }
}
