package com.example.factorymethoddesign;

import com.example.factorymethoddesign.store.ICommodity;
import org.junit.jupiter.api.Test;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/28 20:32
 * @phone 15524322169
 */
public class ApiTest {

    @Test
    public  void test01() throws Exception {

        StoreFactory storeFactory = new StoreFactory();

        ICommodity commodity = storeFactory.getCommodity(1);
        commodity.sendCommodity("10001", "1000001", "666", null);

    }
}
