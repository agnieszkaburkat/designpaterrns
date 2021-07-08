package com.aburkat.decorator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

class PizzaOrdererTest {

  @Test
  void testIfOrderCreatedCorrectly_onlySzamankaPizza() {
    final Pizza pizza = PizzaOrderer.generateOrder(1, Collections.emptyList());
    assertThat(pizza.getPizzaComposition()).isEqualTo("Pizza Szamanka");
    assertThat(pizza.getPrice()).isEqualTo(35);
  }

  @Test
  void testIfOrderCreatedCorrectly_SzamankaPizzaWithExtraCheese() {
    final Pizza pizza = PizzaOrderer.generateOrder(1, Collections.singletonList(2));
    assertThat(pizza.getPizzaComposition()).isEqualTo("Pizza Szamanka with doubled cheese");
    assertThat(pizza.getPrice()).isEqualTo(37);
  }

  @Test
  void testIfOrderCreatedCorrectly_SzamankaPizzaWithExtraCheeseExtraOliveVegan() {
    final Pizza pizza = PizzaOrderer.generateOrder(1, new ArrayList() {{
      add(2);
      add(1);
      add(3);
    }});
    assertThat(pizza.getPizzaComposition()).isEqualTo("Pizza Szamanka with doubled cheese with extra olive with vegan ingredients");
    assertThat(pizza.getPrice()).isEqualTo(38);
  }

  @Test
  void testIfOrderCreatedCorrectly_CottoPizzaWithExtraCheeseTwoTimes() {
    final Pizza pizza = PizzaOrderer.generateOrder(3, new ArrayList() {{
      add(2);
      add(2);
    }});
    assertThat(pizza.getPizzaComposition()).isEqualTo("Pizza Margherita with doubled cheese with doubled cheese");
    assertThat(pizza.getPrice()).isEqualTo(33);
  }

  @Test
  void testIfOrderCreatedCorrectly_CottoPizzaWithExtraOliveTwoTimes() {
    final Pizza pizza = PizzaOrderer.generateOrder(3, new ArrayList() {{
      add(1);
      add(1);
    }});
    assertThat(pizza.getPizzaComposition()).isEqualTo("Pizza Margherita with extra olive with extra olive");
    assertThat(pizza.getPrice()).isEqualTo(31);
  }
}
