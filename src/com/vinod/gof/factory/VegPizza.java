package com.vinod.gof.factory;

public class VegPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Veg PizzaStore");
    }

    @Override
    public void bake() {
        System.out.println("Baking Veg PizzaStore");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Veg PizzaStore");
    }
}
