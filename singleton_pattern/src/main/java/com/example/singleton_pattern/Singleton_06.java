package com.example.singleton_pattern;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/5 22:09
 * @phone 15524322169
 */
public class Singleton_06 {

    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<>();

    private Singleton_06(){}

    public static final Singleton_06 getInstance()
    {
        for (;;)
        {
            Singleton_06 instance = INSTANCE.get();
            if(instance != null) return instance;
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton_06.getInstance());
            }).start();
        }
    }


}
