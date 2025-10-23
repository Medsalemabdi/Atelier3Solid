package com.directi.training.srp.exercise;

import java.util.List;

public class CarFormatter {
    public String getCarNames(List<Car> cars){
        StringBuilder sb = new StringBuilder();
        for(Car c : cars){
            sb.append(c.getBrand()).append(" ").append(c.getModel()).append(", ");
        }
        return sb.substring(0,sb.length()-2);
    }
}

