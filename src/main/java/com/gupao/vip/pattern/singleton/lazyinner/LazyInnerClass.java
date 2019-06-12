package com.gupao.vip.pattern.singleton.lazyinner;

/**
 * 懒汉单例
 * 内部类实现，无需上锁，用的是 jvm 类加载机制的锁
 * 性能最优写法
 */
public class LazyInnerClass {

    private LazyInnerClass() {
        System.out.println("LazyReflectClass 构造器。。。");
    }


    /**
     *
     */
    public static LazyInnerClass getInstance() {
        System.out.println("LazyReflectClass getInstance()。。。");
        return InitInstance.instance;
    }


    /**
     * 这是一个静态内部类
     * TODO 这是什么时候初始化的呢？
     */
    private static class InitInstance {
        public static final LazyInnerClass instance = new LazyInnerClass();

        public InitInstance() {
            System.out.println("内部类 InitInstance 构造器。。。");
        }
    }


}
