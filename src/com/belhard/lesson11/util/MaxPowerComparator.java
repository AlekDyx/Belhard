package com.belhard.lesson11.util;

import com.belhard.lesson11.model.Car;

import java.util.Comparator;

public class MaxPowerComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getPower() - o2.getPower();
    }
}
