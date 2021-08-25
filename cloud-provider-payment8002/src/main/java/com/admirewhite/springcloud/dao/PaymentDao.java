package com.admirewhite.springcloud.dao;

import com.admirewhite.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentDao
 * @Description
 * @Author wangchen
 * @Date 2021/8/25 12:38 下午
 **/
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
