package com.belhard.lesson4;

import com.belhard.lesson4.base.BasePhone;
import com.belhard.lesson4.model.SmartPhone;
import com.belhard.lesson4.model.Somephone;
import com.belhard.lesson4.user.User;

public class Main {

    public static void main(String[] args) {
        Somephone somephone1 = new Somephone("Samsung", "S5", true);
        System.out.println(somephone1);
        somephone1.call();

        BasePhone smartPhone1 = new SmartPhone("Nokia", "3310", "Nokia OS" );
        System.out.println(smartPhone1);
        smartPhone1.ring();
        smartPhone1.toString();
        User user = new User ("Nik");
        user.callPhone(somephone1);
        user.callPhone(smartPhone1);
        System.out.println(smartPhone1.toString());
    }
}
