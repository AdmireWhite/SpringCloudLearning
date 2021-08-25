package com.admirewhite.springcloud.service;

import com.admirewhite.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentService
 * @Description
 * @Author wangchen
 * @Date 2021/8/25 12:54 下午
 **/
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
