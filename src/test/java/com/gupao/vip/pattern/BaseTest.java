package com.gupao.vip.pattern;

public class BaseTest {

    public static void main(String[] args) {
        Class c = String.class;

        Object o = new String();

        if (o.getClass().equals(c)) {
            System.out.println("true....");
        } else {
            System.out.println("false...");
        }
    }
}
