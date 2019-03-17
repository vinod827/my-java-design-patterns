package com.vinod.gof.singleton;

public class SingletonPattern {

    //Eager initialization
    private static SingletonPattern singletonPattern;

    private SingletonPattern() {
    }

    //Lasy initialization
    //Thread Safe Singleton class
    public static SingletonPattern getInstance() {
        synchronized (SingletonPattern.class) {
            if (null == singletonPattern) {
                singletonPattern = new SingletonPattern();
            }
        }
        return singletonPattern;
    }


}
