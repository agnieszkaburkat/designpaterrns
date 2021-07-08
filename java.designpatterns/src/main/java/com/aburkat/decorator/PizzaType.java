package com.aburkat.decorator;

import java.util.Arrays;

public enum PizzaType {
  SZAMANKA(1, new SzamankaPizza()),
  COTTO(2, new CottoPizza()),
  MARGHERITA(3, new MargheritaPizza());

  private int intIdentifier;

  private Pizza pizza;

  PizzaType(int intIdentifier, Pizza pizza) {
    this.intIdentifier = intIdentifier;
    this.pizza = pizza;
  }

  public int getIntIdentifier() {
    return intIdentifier;
  }

  public Pizza getPizza() {
    return pizza;
  }

  public static Pizza getPizzaFromInput(int intIdentifier) {
    return Arrays.stream(PizzaType.values()).filter(type -> type.getIntIdentifier() == intIdentifier).findFirst()
        .get()
        .getPizza();
  }
}
