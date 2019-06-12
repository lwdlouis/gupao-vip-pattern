package com.gupao.vip.pattern.singleton.hungry;

public class HungrySingletonTest {

    public static void main(String[] args) {

        System.out.println("测试方法开始运行咯。。。");

        HungrySingletonSimple hungrySingletonSimple = HungrySingletonSimple.getInstance();

        System.out.println(hungrySingletonSimple.toString());

    }
}
