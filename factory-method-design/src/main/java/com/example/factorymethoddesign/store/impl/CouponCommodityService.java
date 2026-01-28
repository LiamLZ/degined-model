package com.example.factorymethoddesign.store.impl;

import com.example.factorymethoddesign.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Map;


/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/28 20:23
 * @phone 15524322169
 */
public class CouponCommodityService implements ICommodity {

    Logger logger = LoggerFactory.getLogger(CouponCommodityService.class.getName());

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, extMap);
        logger.info("测试结果[优惠券]：测试成功");
    }
}
