package com.gupao.vip.pattern.singleton.reflect;

import java.lang.reflect.Constructor;

public class LazyReflectTest {


    public static void main(String[] args) throws Exception {

        /**
         * 正常调用
         */
        Object o1 = LazyReflectClass.getInstance();

        /**
         * 装逼式，反射调用
         */
        Class<LazyReflectClass> clazz = LazyReflectClass.class;
        Constructor constructor = clazz.getDeclaredConstructor(null);
        //强吻
        constructor.setAccessible(true);

        Object o2 = constructor.newInstance();



        System.out.println("o1 : " + o1);
        System.out.println("o2 : " + o2);

    }
}
