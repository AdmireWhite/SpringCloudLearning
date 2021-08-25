package com.admirewhite.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName LoadBalancer
 * @Description
 * @Author wangchen
 * @Date 2021/8/25 5:57 下午
 **/
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
