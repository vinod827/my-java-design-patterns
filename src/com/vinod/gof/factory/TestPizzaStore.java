package com.vinod.gof.factory;

public class TestPizzaStore {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
