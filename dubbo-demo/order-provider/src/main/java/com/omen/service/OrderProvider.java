package com.omen.service;

import com.omen.vo.Request;
import com.omen.vo.Response;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/4/26 16:28
 */
public class OrderProvider implements OrderService {
    @Override
    public Response doOrder(Request request) {
        Response response = new Response(200,"success");
        return response;
    }

    @Override
    public Response doOrder2(Request request) {
        Response response = new Response(200,"success");
        return response;
    }
}
