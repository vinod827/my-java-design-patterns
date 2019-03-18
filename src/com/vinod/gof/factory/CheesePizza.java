package com.vinod.gof.factory;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese PizzaStore");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese PizzaStore");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheese PizzaStore");
    }
}
