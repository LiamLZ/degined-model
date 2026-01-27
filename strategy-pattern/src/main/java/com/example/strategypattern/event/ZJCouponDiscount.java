package com.example.strategypattern.event;

import com.example.strategypattern.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/27 22:42
 * @phone 15524322169
 */
public class ZJCouponDiscount implements ICouponDiscount<Double> {


    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));

        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ZERO;
        }

        return discountAmount;
    }
}
