package com.admirewhite.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentMain8001
 * @Description 启动类
 * @Author wangchen
 * @Date 2021/8/25 11:21 上午
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {

    public static void main(String[] args) {
            SpringApplication.run(PaymentMain8002.class,args);
    }
}
