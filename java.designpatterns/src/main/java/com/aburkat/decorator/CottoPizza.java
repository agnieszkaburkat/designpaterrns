package com.aburkat.decorator;

public class CottoPizza implements Pizza {
  @Override
  public int getPrice() {
    return 35;
  }

  @Override
  public String getPizzaComposition() {
    return "Pizza Cotto";
  }
}
