package com.example.factorymethoddesign;

import com.example.factorymethoddesign.store.ICommodity;
import com.example.factorymethoddesign.store.impl.CardCommodityService;
import com.example.factorymethoddesign.store.impl.CouponCommodityService;
import com.example.factorymethoddesign.store.impl.GoodsCommodityService;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/28 20:21
 * @phone 15524322169
 */
public class StoreFactory {


    public ICommodity getCommodity(Integer commodityType) {
        if (1 == commodityType) {
            return new CardCommodityService();
        } else if (2 == commodityType) {
            return new CouponCommodityService();
        } else if (3 == commodityType) {
            return new GoodsCommodityService();
        }
        throw new RuntimeException("不存在的商品服务类型");
    }
}
