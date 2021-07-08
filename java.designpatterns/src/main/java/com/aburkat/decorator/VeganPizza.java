package com.aburkat.decorator;

public class VeganPizza extends PizzasExtras {

  public VeganPizza(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public int getPrice() {
    return pizza.getPrice();
  }

  @Override
  public String getPizzaComposition() {
    return pizza.getPizzaComposition() + " with vegan ingredients";
  }
}
