package com.example.prototypepattern;

import com.example.prototypepattern.group.impl.JDNetMall;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/26 21:23
 * @phone 15524322169
 */
public class ApiTest {

    Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_prototype() {

        JDNetMall jdNetMall = new JDNetMall("10001", "123456");
        String data = jdNetMall.generateGoodsPoster("https://item.jd.com/100008348900.html");
        logger.info("测试结果：{}" , data);

    }
}
