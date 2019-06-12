package com.gupao.vip.pattern.singleton.hungry;


/**
 * 饿汉式单例模式
 * 简单实现
 */
public class HungrySingletonSimple {

    /**
     * 类加载的时候就实例化
     */
    private static final HungrySingletonSimple instance = new HungrySingletonSimple();


    static {
        System.out.println("静态块加载了。。。instance = " + String.valueOf(instance));
    }

    /**
     * 私有化构造方法
     */
    private HungrySingletonSimple() {
        System.out.println("构造方法加载了。。。instance = " + String.valueOf(instance));
    }

    /**
     * 公有的全局唯一获取方法
     */
    public static HungrySingletonSimple getInstance() {
        System.out.println("getInstance。。。");
        return instance;
    }

}
