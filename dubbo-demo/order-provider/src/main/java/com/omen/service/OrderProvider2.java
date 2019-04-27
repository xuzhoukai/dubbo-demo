package com.omen.service;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/4/27 16:30
 */
public class OrderProvider2 implements OrderService2 {
    @Override
    public String doQuery(String message) {
        return "hello:"+message;
    }
}
