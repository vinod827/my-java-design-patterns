package com.vinod.gof.factory;


public class Male implements Person {
    @Override
    public void wish(String msg) {
        System.out.println("Male class: " +msg);
    }

}
