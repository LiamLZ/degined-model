package com.example.strategypattern.event;

import com.example.strategypattern.ICouponDiscount;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/27 17:53
 * @phone 15524322169
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String, String>> {
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        String x = couponInfo.get("x");
        String n = couponInfo.get("n");

        // 小于商品金额条件的，直接返回商品原价
        if (skuPrice.compareTo(new BigDecimal(x)) < 0) {
            return skuPrice;
        }

        // 减去优惠金额判断
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(n));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ZERO;
        }


        return discountAmount;
    }
}
