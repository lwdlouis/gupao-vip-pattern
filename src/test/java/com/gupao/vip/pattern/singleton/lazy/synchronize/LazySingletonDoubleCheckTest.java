package com.gupao.vip.pattern.singleton.lazy.synchronize;

public class LazySingletonDoubleCheckTest {

    public static void main(String[] args) {

        Thread t1  = new Thread(new ExcectorThreadDoubleCheck());

        Thread t2  = new Thread(new ExcectorThreadDoubleCheck());


        t1.start();

        t2.start();


        System.out.println("Tread End...");
    }
}
