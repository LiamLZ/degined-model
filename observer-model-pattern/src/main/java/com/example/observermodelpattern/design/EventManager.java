package com.example.observermodelpattern.design;


import com.example.observermodelpattern.design.listener.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/1 21:04
 * @phone 15524322169
 */
public class EventManager {

    Map<Enum<EventType>, List<EventListener>> listeners = new HashMap<>();

    public EventManager(Enum<EventType>... operations) {
        for (Enum<EventType> operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public enum EventType {
        MQ, Message
    }


    public void subscribe(Enum<EventType> eventType, EventListener eventListener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(eventListener);
    }

    public void unsubscribe(Enum<EventType> eventType, EventListener eventListener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(eventListener);
    }

    public void notify(Enum<EventType> eventType, LotteryResult result) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.doEvent(result);
        }
    }


}
