package com.gupao.vip.pattern.singleton.lazy.synchronize;

public class ExcectorThreadSynchronize implements Runnable {

    @Override
    public void run() {
        LazySingletonSynchronized lazy = LazySingletonSynchronized.getInstance();
        System.out.println(Thread.currentThread().getName() + " : " + lazy);
    }
}
