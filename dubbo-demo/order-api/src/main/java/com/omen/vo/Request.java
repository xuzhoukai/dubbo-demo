package com.omen.vo;

import java.io.Serializable;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/4/26 16:18
 */
public class Request implements Serializable{
    private static final long serialVersionUID = -6847848279988201105L;
    private String message;

    public Request(String message) {
        this.message = message;
    }

    public Request() {
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
