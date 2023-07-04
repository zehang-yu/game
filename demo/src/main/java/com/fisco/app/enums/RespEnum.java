package com.fisco.app.enums;

public enum RespEnum {
    SUCCESS(0,"success"),

    LOGIN_FAIL(10000,"username or password not right");

    private int code;

    private String msg;

    RespEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
