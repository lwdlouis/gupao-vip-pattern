package com.gupao.vip.pattern.singleton.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 有线程问题，在 put 的时候
 * 解决线程问题折中方案， 使用 double check
 */
public class ContainerSingleton {

    Map<String, Object> ioc = new ConcurrentHashMap<>();

    public Object getInstances(String className) {

        if (ioc.containsKey(className)) {
            return ioc.get(className);
        }

        Object obj = null;
        try {
            obj = Class.forName(className).getDeclaredConstructor().newInstance();

            ioc.put(className, obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

}
