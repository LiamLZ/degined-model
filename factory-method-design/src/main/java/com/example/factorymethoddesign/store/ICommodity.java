package com.example.factorymethoddesign.store;

import java.util.Map;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/28 20:21
 * @phone 15524322169
 */
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String,String> extMap) throws Exception;

}
