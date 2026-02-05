package com.example.singleton_pattern;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/5 22:05
 * @phone 15524322169
 */
public class Singleton_03 {

    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03() {
    }

    public static Singleton_03 getInstance() {
        return instance;
    }

}
