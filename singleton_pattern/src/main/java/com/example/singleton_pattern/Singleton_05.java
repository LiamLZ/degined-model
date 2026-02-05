package com.example.singleton_pattern;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/5 22:08
 * @phone 15524322169
 */
public class Singleton_05 {

    private static volatile Singleton_05 instance;


    private Singleton_05() {
    }


    public static Singleton_05 getInstance()
    {
        if (instance != null) {
           return instance;
        }
        synchronized (Singleton_05.class) {
            if (instance != null) {
                return instance;
            }
            instance = new Singleton_05();
            return instance;
        }
    }

}
