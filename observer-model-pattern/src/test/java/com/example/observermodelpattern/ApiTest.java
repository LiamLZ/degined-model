package com.example.observermodelpattern;

import com.example.observermodelpattern.design.LotteryResult;
import com.example.observermodelpattern.design.LotteryServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/1 21:16
 * @phone 15524322169
 */
public class ApiTest {


    Logger logger=LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_Observer(){

        LotteryServiceImpl lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("234324535");
        logger.info("测试结果：{}",result);
        System.out.println( result);

    }
}
