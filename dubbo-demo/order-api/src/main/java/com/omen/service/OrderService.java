package com.omen.service;

import com.omen.vo.Request;
import com.omen.vo.Response;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/4/26 16:17
 */
public interface OrderService {
    public Response doOrder(Request request);

    public Response doOrder2(Request request);
}
