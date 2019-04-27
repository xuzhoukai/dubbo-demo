package com.omen.service;

import com.omen.vo.Request;
import com.omen.vo.Response;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/4/27 08:48
 */
public class OrderConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("service-consumer.xml");
        OrderService orderService = (OrderService) context.getBean("orderProvider");
        Response response = orderService.doOrder(new Request());
        System.out.println(response);
        Response response2 = orderService.doOrder2(new Request());
        System.out.println(response2);
        OrderService2 orderService2 = (OrderService2) context.getBean("orderProvider2");
        String result = orderService2.doQuery("kaixin");
        System.out.println(result);

    }
}
