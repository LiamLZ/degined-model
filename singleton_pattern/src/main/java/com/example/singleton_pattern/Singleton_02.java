package com.example.singleton_pattern;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/5 22:02
 * @phone 15524322169
 */
public class Singleton_02 {

    private static Singleton_02 instance;

    private Singleton_02() {

    }


    public static synchronized Singleton_02 getInstance() {
        if (instance  != null) {
            return instance;
        }
        instance = new Singleton_02();
        return instance;
    }
}
