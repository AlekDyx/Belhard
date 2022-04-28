package com.belhard.lesson9.util;

import com.belhard.lesson9.exception.AgeException;
import com.belhard.lesson9.exception.OldException;
import com.belhard.lesson9.exception.YoungException;

public class AgeUtil {

    public static void checkAge(int age) {

        try {
            checkAgeYong(age);
            checkAgeOld(age);
            System.out.println("good");
        } catch (YoungException | OldException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("final");
        }
    }
//        try {
//            if (age < 16) {
//                throw new YoungException("Возраст меньше нуля");
//            }
//        if (age > 100) {
//            throw new OldException("Нереальный возраст");
//        }
//            System.out.println("good age");
//        } catch (AgeException ye) {
//            ye.printStackTrace();
//            System.out.println(ye.getMessage());
//        } finally {
//            System.out.println("Finish");
//        }
//    }

    private static void checkAgeYong(int age) throws YoungException {
        if (age < 16) {
            throw new YoungException("Возраст меньше нуля");
        }
    }

    private static void checkAgeOld(int age) throws OldException {
        if (age > 100) {
            throw new OldException("Нереальный возраст");
        }
    }
}

