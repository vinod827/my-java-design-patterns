package com.vinod.gof.factory;


public class Female implements Person {
    @Override
    public void wish(String msg) {
        System.out.println("Female class: "+msg);
    }
}
