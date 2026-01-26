package com.example.prototypepattern.group;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/26 21:24
 * @phone 15524322169
 */
public abstract class NetMall {


    protected final Logger logger = LoggerFactory.getLogger(NetMall.class);


    String uId;

    String uPwd;


    public NetMall(String uId, String uPwd) {
        this.uId = uId;
        this.uPwd = uPwd;
    }


    protected abstract Boolean login(String uId, String uPwd);


    protected abstract Map<String, String> reptile(String skuUrl);

    protected abstract String createBase64(Map<String, String> goodsInfo);


    public String generateGoodsPoster(String skuUrl) {
        if (!login(uId, uPwd)) {
            return "登陆失败";
        }

        Map<String, String> goodsInfo = reptile(skuUrl);

        return createBase64(goodsInfo);

    }


}
