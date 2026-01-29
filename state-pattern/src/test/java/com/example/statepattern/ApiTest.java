package com.example.statepattern;

import com.alibaba.fastjson.JSON;
import com.example.statepattern.common.ActivityService;
import com.example.statepattern.enums.Status;
import com.example.statepattern.pattern.Result;
import com.example.statepattern.pattern.event.StateHandler;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/29 21:40
 * @phone 15524322169
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_Editing2Arraignment() {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Editing);

        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.arraignment(activityId, Status.Editing);

        logger.info("测试结果(编辑中To提审活动)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }

}
