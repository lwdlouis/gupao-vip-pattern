package com.gupao.vip.pattern.singleton.lazy.synchronize;

public class LazySingletonDoubleCheck {

    private static LazySingletonDoubleCheck instance = null;

    private LazySingletonDoubleCheck() {

    }

    /**
     * 这个比直接锁整个方法性能优越在于线程能进入这个方法，控制粒度更细了
     * 如果这个单例已经创建，那么不用等锁就可以返回。
     * 如果整个方法都上锁，无论这个单例是否初始化了，都要等待解锁
     */
    public static LazySingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (LazySingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new LazySingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
