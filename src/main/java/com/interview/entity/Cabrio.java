package com.interview.entity;

import com.interview.constant.CarConstants;

public class Cabrio implements Car {
    @Override
    public String getType() {
        return CarConstants.CABRIO_TYPE;
    }
}
