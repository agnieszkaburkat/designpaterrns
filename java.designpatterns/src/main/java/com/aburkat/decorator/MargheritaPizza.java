package com.aburkat.decorator;

public class MargheritaPizza implements Pizza {
  @Override
  public int getPrice() {
    return 29;
  }

  @Override
  public String getPizzaComposition() {
    return "Pizza Margherita";
  }
}
