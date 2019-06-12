package com.gupao.vip.pattern.singleton.lazy.synchronize;

import java.util.Date;

public class LazySingletonSynchronizedTest {

    public static void main(String[] args) {

        Thread t1  = new Thread(new ExcectorThreadSynchronize());

        Thread t2  = new Thread(new ExcectorThreadSynchronize());


        t1.start();

        t2.start();


        System.out.println("Tread End...");
    }
}
