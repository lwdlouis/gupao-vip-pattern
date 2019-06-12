package com.gupao.vip.pattern.singleton.lazy;

public class ExcectorThread implements Runnable {

    @Override
    public void run() {
        LazySingletonSimple simple = LazySingletonSimple.getInstance();
        System.out.println(Thread.currentThread().getName() + " : " + simple);
    }
}
