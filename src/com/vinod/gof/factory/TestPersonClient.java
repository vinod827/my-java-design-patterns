package com.vinod.gof.factory;

public class TestPersonClient {
    public static void main(String[] args) {
        PersonClient personClient = new PersonClient();
        personClient.person("male");
        personClient.person("female");
    }
}
