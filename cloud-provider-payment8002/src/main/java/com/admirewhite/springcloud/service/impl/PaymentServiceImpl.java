package com.admirewhite.springcloud.service.impl;

import com.admirewhite.springcloud.dao.PaymentDao;
import com.admirewhite.springcloud.entities.Payment;
import com.admirewhite.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description
 * @Author wangchen
 * @Date 2021/8/25 12:52 下午
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
