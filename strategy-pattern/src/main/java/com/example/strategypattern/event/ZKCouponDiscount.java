package com.example.strategypattern.event;

import com.example.strategypattern.ICouponDiscount;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/27 22:44
 * @phone 15524322169
 */
public class ZKCouponDiscount implements ICouponDiscount<Double> {


    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        // 参数校验
        if (couponInfo == null || skuPrice == null) {
            return BigDecimal.ZERO;
        }

        // 验证 couponInfo 的有效性
        if (couponInfo < 0) {
            return BigDecimal.ZERO;
        }

        try {
            // 使用 String 构造函数避免 Double 精度问题
            BigDecimal couponDecimal = new BigDecimal(String.valueOf(couponInfo)).setScale(2, RoundingMode.HALF_UP);
            BigDecimal discountAmount = skuPrice.multiply(couponDecimal);

            // 修正逻辑：当折扣金额小于等于0时返回0
            if (discountAmount.compareTo(BigDecimal.ZERO) <= 0) {
                return BigDecimal.ZERO;
            }

            return discountAmount.setScale(2, RoundingMode.HALF_UP);
        } catch (NumberFormatException e) {
            // 如果转换失败，返回0
            return BigDecimal.ZERO;
        }
    }

}
