package com.aburkat.decorator;

import java.util.Arrays;
import java.util.function.Function;

public enum PizzaAddons {
  EXTRA_OLIVE(1, ExtraOlivePizza::new),
  EXTRA_CHEESE(2, ExtraCheesePizza::new),
  VEGAN(3, VeganPizza::new);

  private int intIdentifier;

  private Function<Pizza, Pizza> pizzaFunction;

  PizzaAddons(int intIdentifier, Function<Pizza, Pizza> pizzaFunction) {
    this.intIdentifier = intIdentifier;
    this.pizzaFunction = pizzaFunction;
  }

  public Function<Pizza, Pizza> getPizzaFunction() {
    return pizzaFunction;
  }

  public int getIntIdentifier() {
    return intIdentifier;
  }


  public static Pizza getPizzaFromInput(int intIdentifier, Pizza pizza) {
    return Arrays.stream(PizzaAddons.values()).filter(type -> type.getIntIdentifier() == intIdentifier).findFirst()
        .map(type -> type.getPizzaFunction().apply(pizza))
        .get();
  }
}
