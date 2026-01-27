package com.example.strategypattern.event;

import com.example.strategypattern.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/27 22:47
 * @phone 15524322169
 */
public class NYCouponDiscount implements ICouponDiscount<Double> {

    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {

        return new BigDecimal(couponInfo);
    }
}
