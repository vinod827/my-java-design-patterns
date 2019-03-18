package com.vinod.gof.factory;

public class MeatPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Meat PizzaStore");
    }

    @Override
    public void bake() {
        System.out.println("Baking Meat PizzaStore");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Meat PizzaStore");
    }
}
