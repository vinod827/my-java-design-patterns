package com.vinod.gof.singleton;

public class SingletonPattern {
    private static SingletonPattern singletonPattern;

    private SingletonPattern(){
    }

    //Lasy initialization
    public static SingletonPattern getInstance(){
        if(null == singletonPattern){
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }

}