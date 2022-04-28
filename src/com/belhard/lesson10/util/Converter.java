package com.belhard.lesson10.util;

@FunctionalInterface
public interface Converter<T,N> {
    T convert(N el);

//    static boolean isElement(String str) {
//        return str.equals("123");
//    }
//
//    default void printStr(String str) {
//        System.out.println(str);
//    }
//
//    String toString();

}
