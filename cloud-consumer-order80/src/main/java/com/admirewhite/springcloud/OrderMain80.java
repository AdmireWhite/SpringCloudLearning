package com.admirewhite.springcloud;

import com.admirewhite.myrule.MySelfRule;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName OrderMain80
 * @Description
 * @Author wangchen
 * @Date 2021/8/25 1:34 下午
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
