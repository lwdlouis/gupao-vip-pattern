package com.gupao.vip.pattern.singleton.threadlocal;


/**
 * 彩蛋 ThreadLocal， 保证线程内的单例。 属于注册时单例一种
 * 但是是个伪单例，因为只保证当前线程内。 利用了 threadlocal 的特性。
 * threadlocal 其实就是一个 map， key 是当前 thread， value 就是 put 的value，来保证线程内对象安全。
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstances = new ThreadLocal(){

        @Override
        protected Object initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {

    }

    /**
     *
     * public T get() {
     *         Thread t = Thread.currentThread();
     *         ThreadLocalMap map = getMap(t);
     *         if (map != null) {
     *             ThreadLocalMap.Entry e = map.getEntry(this);
     *             if (e != null) {
     *                 @SuppressWarnings("unchecked")
     *                 T result = (T)e.value;
     *                 return result;
     *             }
     *         }
     *         return setInitialValue();
     *     }
     *
     *  可以看出， ThreadLocal 依赖与里面的 ThreadLocalMap
     *  而这个map 是存放在 每个 thread 里面的。 根据当前线程，拿到这个map，
     */
    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstances.get();
    }

}
