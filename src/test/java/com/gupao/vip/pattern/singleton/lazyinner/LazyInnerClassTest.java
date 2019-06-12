package com.gupao.vip.pattern.singleton.lazyinner;

public class LazyInnerClassTest {


    public static void main(String[] args) {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyInnerClass inner = LazyInnerClass.getInstance();
                System.out.println(Thread.currentThread().getName() + " : " + inner);
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyInnerClass inner = LazyInnerClass.getInstance();
                System.out.println(Thread.currentThread().getName() + " : " + inner);
            }
        });


        t1.start();
        t2.start();

        System.out.println("运行完毕。。。");

    }


}
