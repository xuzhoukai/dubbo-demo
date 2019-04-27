package com.omen.vo;

import java.io.Serializable;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/4/26 16:18
 */
public class Response implements Serializable{
    private static final long serialVersionUID = 3078661619448562412L;
    private int code;
    private String message;

    public Response(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Response() {
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

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
