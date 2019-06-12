package com.gupao.vip.pattern.singleton.lazy.synchronize;

/**
 * 懒汉单例
 * 锁方法实现线程安全
 */
public class LazySingletonSynchronized {

    private static LazySingletonSynchronized instance = null;

    private LazySingletonSynchronized() {

    }

    public static synchronized LazySingletonSynchronized getInstance() {
        if (instance == null) {
            instance = new LazySingletonSynchronized();
        }
        return instance;
    }
}
