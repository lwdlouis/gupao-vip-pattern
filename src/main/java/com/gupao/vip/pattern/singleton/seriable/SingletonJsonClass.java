package com.gupao.vip.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * 使用JSON 来破坏 单例
 * 运用 反射的机方法可以避免 json 反序列化破坏单例
 * 因为 json 还是会调用构造方法
 *
 */
public class SingletonJsonClass {

    private SingletonJsonClass() {

        System.out.println("LazyReflectClass 构造器。。。");

        if (InitInstance.instance != null) {
            throw new RuntimeException("不允许构建多个实例");
        }
    }


    /**
     *
     */
    public static SingletonJsonClass getInstance() {
        System.out.println("LazyReflectClass getInstance()。。。");
        return InitInstance.instance;
    }


    /**
     * 这是一个静态内部类
     */
    private static class InitInstance {
        public static final SingletonJsonClass instance = new SingletonJsonClass();

        public InitInstance() {
            System.out.println("内部类 InitInstance 构造器。。。");
        }
    }


}
