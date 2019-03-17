package com.vinod.gof.singleton;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable {
    private static volatile Logger instance;

    private Logger(){}

    public static Logger getInstance(){
        if(null == instance) {
            synchronized (Logger.class) {
                if (null == instance) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message){
        System.out.println(message);
    }

    private Object readResolve(){
      return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
