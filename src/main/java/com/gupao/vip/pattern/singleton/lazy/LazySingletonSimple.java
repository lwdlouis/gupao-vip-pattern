package com.gupao.vip.pattern.singleton.lazy;

/**
 * 简单的懒汉式单例
 * 调用时才创建
 */
public class LazySingletonSimple {

    private static LazySingletonSimple instance = null;

    private LazySingletonSimple() {

    }

    public static LazySingletonSimple getInstance() {
        if (instance == null) {
            instance = new LazySingletonSimple();
        }
        return instance;
    }

}
