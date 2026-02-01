package com.example.observermodelpattern.design;

import com.example.observermodelpattern.design.listener.MqEventListener;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/1 21:10
 * @phone 15524322169
 */
public abstract class LotteryService {

    private final EventManager eventManager;

    public LotteryService() {

        eventManager = new EventManager(EventManager.EventType.MQ, EventManager.EventType.Message);
        eventManager.subscribe(EventManager.EventType.MQ, new MqEventListener());
        eventManager.subscribe(EventManager.EventType.Message, new MqEventListener());

    }

    public LotteryResult draw(String uId) {
        LotteryResult lotteryResult = doDraw(uId);
        eventManager.notify(EventManager.EventType.MQ, lotteryResult);
        eventManager.notify(EventManager.EventType.Message, lotteryResult);
        return lotteryResult;
    }

    protected abstract LotteryResult doDraw(String uId);


}
