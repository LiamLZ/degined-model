package com.example.strategypattern;

import com.example.strategypattern.event.Context;
import com.example.strategypattern.event.ZJCouponDiscount;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/27 22:50
 * @phone 15524322169
 */
public class ApiTest {
    Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_zj(){

        Context<Double> context = new Context<>(new ZJCouponDiscount());

        BigDecimal discountAmount = context.discountAmount(200D, new BigDecimal(1000));

        logger.info(" 直减优惠后金额：" + discountAmount);
    }
}
