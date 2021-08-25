package com.admirewhite.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MySelfRule
 * @Description
 * @Author wangchen
 * @Date 2021/8/25 5:35 下午
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule(); // 定义为随机
    }
}
