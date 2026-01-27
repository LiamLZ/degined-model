package com.example.strategypattern;

import java.math.BigDecimal;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/27 17:49
 * @phone 15524322169
 */
public interface ICouponDiscount<T> {
    /**
     * 优惠券金额计算
     *
     * @param couponInfo 优惠券信息
     * @param skuPrice   商品价格
     * @return 优惠后金额
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);

}
