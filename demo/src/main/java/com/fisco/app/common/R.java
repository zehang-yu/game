package com.fisco.app.common;

import com.fisco.app.enums.RespEnum;

import java.util.HashMap;

public class R extends HashMap<String, Object> {
    public R () {
        put("code", RespEnum.SUCCESS.getCode());
        put("msg", RespEnum.SUCCESS.getMsg());
    }

    public static R error() {
        return error(404,"Unknown error");
    }

    public static R error(String msg) {
        return error(404,msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R error(RespEnum respEnum) {
        R r = new R();
        r.put("code", respEnum.getCode());
        r.put("msg", respEnum.getMsg());
        return r;
    }

    public static R ok() {
        return new R();
    }

    public R put (String key, Object value) {
        super.put(key,value);
        return this;
    }
    public static R ok(Object obj) {
        R r = new R();
        r.put("code",RespEnum.SUCCESS.getCode());
        r.put("msg", RespEnum.SUCCESS.getMsg());
        r.put("data", obj);
        return r;
    }


}
