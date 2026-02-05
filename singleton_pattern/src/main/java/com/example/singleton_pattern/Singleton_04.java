package com.example.singleton_pattern;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/5 22:06
 * @phone 15524322169
 */
public class Singleton_04 {

    private static class SingletonHolder{
        private static final Singleton_04 INSTANCE = new Singleton_04();
    }


    private Singleton_04(){

    }


    public static Singleton_04 getInstance(){
        return SingletonHolder.INSTANCE;
    }

}



