package com.aburkat.decorator;

public class ExtraOlivePizza extends PizzasExtras {
  final static int PRICE = 1;

  public ExtraOlivePizza(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public int getPrice() {
    return pizza.getPrice() + PRICE;
  }

  @Override
  public String getPizzaComposition() {
    return pizza.getPizzaComposition() + " with extra olive";
  }
}
