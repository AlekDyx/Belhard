package com.belhard.lesson11;

import com.belhard.lesson11.model.Car;
import com.belhard.lesson11.model.base.Box;
import com.belhard.lesson11.util.MaxPowerComparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Hello");
        System.out.println(stringBox.getT());
        Box<Integer> integerBox = new Box<>(13);
        System.out.println(integerBox.getT());

        ArrayList<Box> boxes = new ArrayList<>() {{
            add(stringBox);
            add(integerBox);
        }};

        boxes.stream().filter(b -> b.getT().equals("Hello")).forEach(b -> System.out.println(b));

        Car car1 = new Car("White", 195, "Ferrari");
        Car car2 = new Car("Yellow", 360, "Ferrari");
        Car car3 = new Car("Black", 963, "Ferrari");

//        System.out.println(car1);

        ArrayList<Car> cars = new ArrayList<>() {{
            add(car1);
            add(car2);
            add(car3);

        }};

        cars.stream().sorted().forEach(car -> System.out.println(car));

        Comparator powerComparator = new MaxPowerComparator();

        cars.stream().sorted(powerComparator).forEach(car -> System.out.println(car));
//
//        ArrayList<Integer> nums = new ArrayList<>() {{
//            add(8);
//            add(7);
//            add(2);
//        }};
//
//        nums.stream().sorted().forEach(i -> System.out.println(i));

//        BigDecimal bigDecimal1 = BigDecimal.valueOf(10.143);
//        BigDecimal bigDecimal2 = BigDecimal.valueOf(10.123);
//
//        System.out.println(bigDecimal1.equals(bigDecimal2));
//        System.out.println(bigDecimal1.compareTo(bigDecimal2));
    }
}
