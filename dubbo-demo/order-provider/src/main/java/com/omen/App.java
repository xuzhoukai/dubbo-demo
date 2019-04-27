package com.omen;


import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        Main.main(args);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/service-provider.xml");
//        context.start();
    }
}
