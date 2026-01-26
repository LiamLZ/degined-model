package com.example.prototypepattern.group.impl;

import com.example.prototypepattern.group.NetMall;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/26 21:29
 * @phone 15524322169
 */
public class JDNetMall extends NetMall {

    public JDNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    @Override
    protected Boolean login(String uId, String uPwd) {
        logger.info("模拟京东用户登录 uId: {} uPwd:{} " , uId, uPwd);
        return true;
    }

    @Override
    protected Map<String, String> reptile(String skuUrl) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "iphone");
        return map;
    }

    @Override
    protected String createBase64(Map<String, String> goodsInfo) {

        return String.valueOf(goodsInfo.hashCode());
    }
}
