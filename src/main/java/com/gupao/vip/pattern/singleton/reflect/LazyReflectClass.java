package com.gupao.vip.pattern.singleton.reflect;

/**
 * 使用反射来破坏 单例
 */
public class LazyReflectClass {

    private LazyReflectClass() {

        System.out.println("LazyReflectClass 构造器。。。");

        /**
         * 在构造方法里面判断，如果实例已经被创建，则不允许调用构造方法。 防止反射攻击。
         * 其他形式的单例也可以用上
         */
        if (InitInstance.instance != null) {
            throw new RuntimeException("不允许构建多个实例");
        }
    }


    /**
     *
     */
    public static LazyReflectClass getInstance() {
        System.out.println("LazyReflectClass getInstance()。。。");
        return InitInstance.instance;
    }


    /**
     * 这是一个静态内部类
     * TODO 这是什么时候初始化的呢？
     */
    private static class InitInstance {
        public static final LazyReflectClass instance = new LazyReflectClass();

        public InitInstance() {
            System.out.println("内部类 InitInstance 构造器。。。");
        }
    }


}
