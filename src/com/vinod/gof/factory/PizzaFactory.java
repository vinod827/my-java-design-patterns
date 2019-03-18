package com.vinod.gof.factory;

public class PizzaFactory {

    public static Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("veggie")){
            pizza = new VegPizza();
        }else if(type.equals("chicken")){
            pizza = new MeatPizza();
        }else if(type.equals("cheese")){
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
