package com.gupao.vip.pattern.singleton.seriable;

import java.io.*;

/**
 * 用序列化破坏单例
 */
public class LazySeriableClassTest {


    public static void main(String[] args) {

        LazySeriableClass s1 = null;

        LazySeriableClass s2 = LazySeriableClass.getInstance();


        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("LazySeriableClass.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("LazySeriableClass.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (LazySeriableClass) ois.readObject();
            ois.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("s1 :" + s1);
        System.out.println("s2 :" + s2);


    }
}
