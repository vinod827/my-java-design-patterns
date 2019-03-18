package com.vinod.gof.factory;

public class PersonClient {
    public Person person(String type){
        Person person = PersonFactory.person(type);
        person.wish("Hello Design Pattern");
        return person;
    }
}
