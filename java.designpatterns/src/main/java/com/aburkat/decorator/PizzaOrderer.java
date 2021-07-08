package com.aburkat.decorator;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class PizzaOrderer {

  public static void main(String[] args) {
    Integer pizzaType;
    List<Integer> addons = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    pizzaType = getPizzaType(scanner);
    getPizzaAddons(scanner, addons);

    Pizza pizza = generateOrder(pizzaType, addons);
    System.out.println("you ordered: " + pizza.getPizzaComposition() + "\nyou order costs: " + pizza.getPrice());
  }

  static Pizza generateOrder(Integer integer, List<Integer> addons) {
    AtomicReference<Pizza> pizza = new AtomicReference<>(PizzaType.getPizzaFromInput(integer));
    addons.forEach(addon ->
        pizza.set(PizzaAddons.getPizzaFromInput(addon, pizza.get())));
    return pizza.get();
  }

  private static int getPizzaType(Scanner scanner) {
    Optional<Integer> pizzaType;
    do {
      pizzaType = readPizzaType(scanner);
    } while (!pizzaType.isPresent());
    return pizzaType.get();
  }

  private static Optional<Integer> readPizzaType(Scanner scanner) {
    try {
      System.out.println("please choose which pizza you'd like to order (press the number of pizza you'd like to order): \n" +
          "1 - Szamanka\n" +
          "2 - Cotto\n" +
          "3 - Margherita\n");
      return Optional.of(scanner.nextInt());
    } catch (InputMismatchException ex) {
      System.out.println("please type the number of pizza, otherwise I cannot proceed with the order.");
      return Optional.empty();
    }
  }

  private static void getPizzaAddons(Scanner scanner, List<Integer> addons) {
    Optional<Integer> addon = Optional.empty();
    while (!addon.isPresent() || addon.get() != 0) {
      addon = getAddon(scanner);
      addon.ifPresent(item -> {
        if (item != 0) addons.add(item);
      });
    }
  }

  private static Optional<Integer> getAddon(Scanner scanner) {
    try {
      System.out.println("Would you like to have some extras on your pizza? \n" +
          "1 - Extra olive\n" +
          "2 - Extra cheese\n" +
          "3 - Vegan option\n" +
          "0 - nothing more to be added, finishing the order :)");
      return Optional.of(scanner.nextInt());
    } catch (InputMismatchException ex) {
      System.out.println("please type the number of extras, otherwise I cannot proceed with the order.");
      return Optional.empty();
    }
  }
}
