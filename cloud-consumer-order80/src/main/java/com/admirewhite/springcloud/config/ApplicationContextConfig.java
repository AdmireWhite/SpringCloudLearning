package com.admirewhite.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * @Description
 * @Author wangchen
 * @Date 2021/8/25 1:38 下午
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced//负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
