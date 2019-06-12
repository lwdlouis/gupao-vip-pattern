package com.gupao.vip.pattern.singleton.hungry;

public class HungrySingletonStaticBlockTest {

    public static void main(String[] args) {

        System.out.println("测试方法开始运行咯。。。");

        HungrySingletonStaticBlock hungrySingletonStaticBlock = HungrySingletonStaticBlock.getInstance();

        System.out.println(hungrySingletonStaticBlock.toString());

    }
}
