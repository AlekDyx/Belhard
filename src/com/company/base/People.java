package com.company.base;

import com.company.model.Address;

public abstract class People {

    protected String name;
    protected String soname;
    protected int age;
    protected Address address;

    public People(String name, String soname, int age, Address address) {
        this.name = name;
        this.soname = soname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSoname() {
        return soname;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoname(String soname) {
        this.soname = soname;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return name + " " +soname+ ", " + age + " лет, " + address.toString();
    }

    void changeAge(Integer newAge) {
        if (age > 0) {
            age = newAge;
        }
    }

    void changeAddress(Address newAddress) {
        address = newAddress;
    }
}