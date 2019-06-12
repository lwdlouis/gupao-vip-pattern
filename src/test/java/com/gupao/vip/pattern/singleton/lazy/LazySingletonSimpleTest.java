package com.gupao.vip.pattern.singleton.lazy;

public class LazySingletonSimpleTest {

    public static void main(String[] args) {

        LazySingletonSimple lazySingletonSimple = LazySingletonSimple.getInstance();

        System.out.println(lazySingletonSimple.toString());
    }
}
