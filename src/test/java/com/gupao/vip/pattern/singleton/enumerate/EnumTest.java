package com.gupao.vip.pattern.singleton.enumerate;

public class EnumTest {

    public static void main(String[] args) {

        System.out.println(SimpleEnum.valueOf("value1").getCode());

        System.out.println(SimpleEnum.value1.getCode());

        SimpleEnum simple = SimpleEnum.getEnunByCode(2);
        switch (simple) {
            case value1:
                System.out.println(simple.getCode());
                break;

            case value2:
                System.out.println(simple.getCode());
                break;
        }

    }
}
