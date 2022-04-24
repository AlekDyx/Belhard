package com.belhard.lesson8.base;

public abstract class Mammals implements Animal {

    private String view;
    private int age;
    private String name;

    public Mammals(String view, int age, String name) {
        this.view = view;
        this.age = age;
        this.name = name;
    }

    public String getView() {
        return view;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setView(String view) {
        this.view = view;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
