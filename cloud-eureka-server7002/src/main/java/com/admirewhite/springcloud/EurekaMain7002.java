package com.admirewhite.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName com.admirewhite.springcloud.EurekaMain7001
 * @Description
 * @Author wangchen
 * @Date 2021/8/25 2:28 下午
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
