package com.modulecode.vo;

//返回数据格式
public class RespResult {
    private int code;
    private String message;
    private Object data;

    public RespResult() {
    }

    private RespResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static RespResult success(Object object) {
        return new RespResult(200, "成功", object);
    }

    public static RespResult success(String message, Object object) {
        return new RespResult(200, message, object);
    }

    public static RespResult error(String message) {
        return new RespResult(-1, message, null);
    }

    public static RespResult error(Object object) {
        return new RespResult(-1, "失敗", object);
    }

    public static RespResult error(String message, Object object) {
        return new RespResult(-1, message, object);
    }
}
