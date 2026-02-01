package com.example.observermodelpattern.design.listener;


import com.example.observermodelpattern.design.LotteryResult;

import lombok.extern.slf4j.Slf4j;


/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/1 20:59
 * @phone 15524322169
 */
@Slf4j
public class MessageEventListener implements EventListener{


    public void doEvent(LotteryResult event) {
        log.info("给用户 {} 发送短信通知(短信)：{}", event.getUId(), event.getMsg());
    }
}
