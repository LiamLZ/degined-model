package com.example.strategypattern.event;

import com.example.strategypattern.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/27 22:49
 * @phone 15524322169
 */
public class Context<T> {
    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }


    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }
}

