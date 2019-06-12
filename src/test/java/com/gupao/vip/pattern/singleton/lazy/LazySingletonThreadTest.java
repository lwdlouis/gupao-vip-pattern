package com.gupao.vip.pattern.singleton.lazy;

public class LazySingletonThreadTest {

    public static void main(String[] args) {

        Thread t1  = new Thread(new ExcectorThread());

        Thread t2  = new Thread(new ExcectorThread());


        t1.start();

        t2.start();


        System.out.println("Tread End...");


    }
}
