package com.gupao.vip.pattern.singleton.enumerate;


import lombok.Getter;

@Getter
public enum SimpleEnum {

    value1(1, "value1"),
    value2(2, "value2")
    ;

    private int code;
    private String desc;

    SimpleEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public static SimpleEnum getEnunByCode(int code) {
        for (SimpleEnum simpleEnum : SimpleEnum.values()) {
            if (code == simpleEnum.getCode()) {
                return simpleEnum;
            }
        }
        return null;
    }



}
