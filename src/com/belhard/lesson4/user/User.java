package com.belhard.lesson4.user;

import com.belhard.lesson4.base.BasePhone;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void callPhone(BasePhone basePhone) {
        basePhone.call();

    }
}
