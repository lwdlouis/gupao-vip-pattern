package com.gupao.vip.pattern.singleton.enumerate;

/**
 * 枚举式单例， 《effective java》 里面推荐写法
 * 属于 注册式单例的一种
 * 在枚举中的构造方法必须是私有的，这就为枚举来实现单例奠定了基础。
 *
 * 枚举的优势是,因为JVM会保证enum不能被反射并且构造器方法只执行一次. 不会被反射，序列化破坏
 *
 * （作为静态内部类实现？）
 */
public enum SingletonEnum {

    INSTANCE();

    private Example1 example1;


    SingletonEnum() {
        example1 = new Example1();
    }

    public Object getInstance() {
        return example1;
    }

}
