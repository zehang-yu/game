package com.fisco.app.enums;

public enum BuyEnum {

    HAS_BUY("00","HAS_BUY"),
    NO_BUY("01","NO_BUY"),
    NEW_USER("02","NEW_USER");


    private String code;
    private String msg;
    BuyEnum(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
