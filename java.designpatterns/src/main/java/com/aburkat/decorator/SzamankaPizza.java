package com.aburkat.decorator;

public class SzamankaPizza implements Pizza {
  @Override
  public int getPrice() {
    return 35;
  }

  @Override
  public String getPizzaComposition() {
    return "Pizza Szamanka";
  }
}
