package com.gupao.vip.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * 使用反序列化来破坏 单例
 * 避免方法：
 * 1。 不要实现 Serializable
 * 2。 实现 checkResolve 方法。
 *     ObjectInputStream 里面有个 readObject 方法，这个方法里面看源码。里面
 *     ObjectInputStream.readOrdinaryObject 方法里面 有个 hasReadResolveMethod 判断，如果有这个方法，
 *     则会 Object rep = desc.invokeReadResolve(obj); 使用 调用这个方法。
 */
public class LazySeriableClass implements Serializable {

    private LazySeriableClass() {

        System.out.println("LazyReflectClass 构造器。。。");

        if (InitInstance.instance != null) {
            throw new RuntimeException("不允许构建多个实例");
        }
    }


    /**
     *
     */
    public static LazySeriableClass getInstance() {
        System.out.println("LazyReflectClass getInstance()。。。");
        return InitInstance.instance;
    }


    /**
     * 这是一个静态内部类
     */
    private static class InitInstance {
        public static final LazySeriableClass instance = new LazySeriableClass();

        public InitInstance() {
            System.out.println("内部类 InitInstance 构造器。。。");
        }
    }


    /**
     * 这个方法一定要返回 Object 才行？
     * 对的因为判断逻辑是
     *
     * readResolveMethod = getInheritableMethod(
     *                         cl, "readResolve", null, Object.class);
     *
     * private static Method getInheritableMethod(Class<?> cl, String name,
     *                                                Class<?>[] argTypes,
     *                                                Class<?> returnType)
     *
     *  returnType 要是 Object.class
     */
    public Object readResolve() {
        return InitInstance.instance;
    }
}
