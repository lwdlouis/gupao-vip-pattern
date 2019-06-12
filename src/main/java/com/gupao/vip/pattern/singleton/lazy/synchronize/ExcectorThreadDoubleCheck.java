package com.gupao.vip.pattern.singleton.lazy.synchronize;

public class ExcectorThreadDoubleCheck implements Runnable {

    @Override
    public void run() {
        LazySingletonDoubleCheck simple = LazySingletonDoubleCheck.getInstance();
        System.out.println(Thread.currentThread().getName() + " : " + simple);
    }
}
