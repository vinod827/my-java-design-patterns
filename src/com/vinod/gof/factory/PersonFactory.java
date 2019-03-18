package com.vinod.gof.factory;

public class PersonFactory {
    public static Person person(String type){
        Person person = null;
        if(type.equals("male")){
            person = new Male();

        }else if(type.equals("female")){
            person = new Female();

        }
        return person;
    }
}
