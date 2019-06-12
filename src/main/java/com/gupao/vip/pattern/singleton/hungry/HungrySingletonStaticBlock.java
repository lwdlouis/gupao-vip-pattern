package com.gupao.vip.pattern.singleton.hungry;


/**
 * 饿汉式单例模式
 * 放在静态代码块执行
 */
public class HungrySingletonStaticBlock {

    private static final HungrySingletonStaticBlock instance;


    /**
     * TODO 静态代码块跟静态参数有什么区别呢？ 现在只知道静态参数是先于静态代码块运行的。
     * 类加载的时候就实例化
     */
    static {
        System.out.println("静态块加载了。。。" );
        instance = new HungrySingletonStaticBlock();
        System.out.println("instance = " + String.valueOf(instance));
    }

    /**
     * 私有化构造方法
     */
    private HungrySingletonStaticBlock() {

        System.out.println("构造方法加载了。。。instance = " + String.valueOf(instance));
    }

    /**
     * 公有的全局唯一获取方法
     */
    public static HungrySingletonStaticBlock getInstance() {
        System.out.println("getInstance。。。");
        return instance;
    }

}
