package com.directi.training.srp.exercise;

import java.util.List;

public class CarSelector {
    public Car getBestCar(List<Car> cars){
        Car best=null;
        for(Car c:cars){
            if(best==null || c.getModel().compareTo(best.getModel())>0){
                best=c;
            }
        }
        return best;
    }
}

