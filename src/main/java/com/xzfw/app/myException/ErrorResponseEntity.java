package com.xzfw.app.myException;

/**
 * 异常信息模板
 * @author 刘靖
 */

public class ErrorResponseEntity {

    /**
     * 异常返回状态码
     */
    private int code;

    /**
     * 异常内容
     */
    private String message;

    public ErrorResponseEntity(int code, String message) {
        this.code = code;
        this.message = message;
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
}
