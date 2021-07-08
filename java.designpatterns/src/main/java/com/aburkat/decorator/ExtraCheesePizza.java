package com.aburkat.decorator;

public class ExtraCheesePizza extends PizzasExtras {
  private final static int PRICE = 2;

  public ExtraCheesePizza(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public int getPrice() {
    return pizza.getPrice() + PRICE;
  }

  @Override
  public String getPizzaComposition() {
    return pizza.getPizzaComposition() + " with doubled cheese";
  }
}
