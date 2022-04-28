package com.belhard.lesson10;

import com.belhard.lesson10.model.Dog;
import com.belhard.lesson10.model.Raсcoon;
import com.belhard.lesson10.util.Converter;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Converter<String, Integer> converter = el -> el.toString();

        int age = 43;
        String ageStr = converter.convert(43);

        Converter<Raсcoon, Dog> dogConverter = dog -> new Raсcoon(dog.getName(), dog.getAge(), "Grey");

        Dog dog = new Dog("Daniel", 3, 23);
        Raсcoon raсcoon = dogConverter.convert(dog);
        System.out.println(raсcoon.getName() + " "
                            + raсcoon.getAge() + " "
                            + raсcoon.getColor());
        raсcoon.displayInfo();

        List<String> strings = new ArrayList<>();
        strings.add("333");
        strings.add("5555");
        strings.add("444");
        strings.forEach(s -> {
            if(s.length() == 30) {
                System.out.println(s);
            }
        });

        strings.stream()
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog);
        List<Raсcoon> raсcoonList = dogs.stream()
                .map(dog1 -> dogConverter.convert(dog1))
                .collect(Collectors.toList());




//        System.out.println(Converter.isElement("123"));
//
//        String b = "qwerty";
//        int c = 5;
//        Object o;
//
//        print(b);
//        print(c);

    }

    public static void print(Object o) {
        System.out.println(o);







//        HashMap<String, String> map =new HashMap<>();
//        map.put("key1", "value1");
//        map.put("key2", "value2");
//        map.put("key3", "value3");
//
//        System.out.println(map.get("key2"));
//
//        map.entrySet().forEach(entry ->
//                System.out.println(entry.getKey() + " " + entry.getValue()));
//
//        TreeSet<String> treeSet = new TreeSet<>();
//        treeSet.add("qwerty");
//        treeSet.add("Hello");
//        treeSet.add("World");
//
//        treeSet.forEach(s -> System.out.println(s));
    }
}
