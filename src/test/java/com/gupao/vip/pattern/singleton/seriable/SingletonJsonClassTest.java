package com.gupao.vip.pattern.singleton.seriable;

import com.alibaba.fastjson.JSON;

public class SingletonJsonClassTest {

    public static void main(String[] args) {

        SingletonJsonClass s1 = null;


        SingletonJsonClass s2 = SingletonJsonClass.getInstance();


        String json = JSON.toJSONString(s2);

        s1 = JSON.parseObject(json, SingletonJsonClass.class);


        System.out.println("s1 :" + s1);
        System.out.println("s2 :" + s2);

    }
}
