package com.vinod.gof.singleton;

public class SingletonPattern {

    //Eager initialization
    private static volatile SingletonPattern singletonPattern;

    private SingletonPattern() {
    }

    //Lasy initialization
    //Thread Safe Singleton class
    public static SingletonPattern getInstance() {
        if(null == singletonPattern) {
            synchronized (SingletonPattern.class) { //class level lock
                if (null == singletonPattern) {
                    singletonPattern = new SingletonPattern();
                }
            }
        }
        return singletonPattern;
    }


}
