package com.example.singleton_pattern;

import java.util.Objects;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/5 22:00
 * @phone 15524322169
 */
public class Singleton_01 {

    private static Singleton_01 instance;


    private Singleton_01()
    {

    }


    public static Singleton_01 getInstance() {
        if(Objects.nonNull( instance)) return instance;
        instance = new Singleton_01();
        return instance;
    }
}
