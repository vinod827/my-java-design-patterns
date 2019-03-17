package com.vinod.gof.singleton;

public class SingletonPattern {

    //Eager initialization
    private static SingletonPattern singletonPattern = new SingletonPattern();

    static{
        singletonPattern = new SingletonPattern();
    }
    private SingletonPattern(){
    }

    //Lasy initialization
    public static synchronized SingletonPattern getInstance(){
/*        if(null == singletonPattern){
            singletonPattern = new SingletonPattern();
        }*/
        return singletonPattern;
    }


}
