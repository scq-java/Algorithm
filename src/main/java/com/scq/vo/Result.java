package com.scq.vo;

import lombok.Data;

/**
 * @ClassName Result
 * @Description
 * @Author JavaQ
 * @Date 2020/1/14 21:45
 **/@Data
public class Result {
    private int code;
    private String msg;
    private Object data;

    public static Result setResult(int code, String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }


    public static Result ok(Object o){
        return Result.setResult(200,"ok",o);
    }
}
