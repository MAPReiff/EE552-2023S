package edu.stevens.ece.ee552;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoffeeMakerTest {
  private CoffeeMaker coffeeMaker;

  @BeforeEach
  public void setUp() {
    coffeeMaker = new CoffeeMaker();
  }

  @Test
  public void testTurnOn() {
    assertFalse(coffeeMaker.isOn());
    coffeeMaker.turnOn();
    assertTrue(coffeeMaker.isOn());
  }

  @Test
  public void testAddCoffee() {
    int initialScoops = coffeeMaker.getScoopsCoffee();
    coffeeMaker.addCoffee(2);
    assertEquals(initialScoops + 2, coffeeMaker.getScoopsCoffee());
  }

  @Test
  public void testAddWater() {
    int initialCups = coffeeMaker.getCupsWater();
    coffeeMaker.addWater(2);
    assertEquals(initialCups + 2, coffeeMaker.getCupsWater());
  }

  @Test
  public void testBrewCoffee() {
    coffeeMaker.addWater(4);
    coffeeMaker.turnOn();
    coffeeMaker.brewCoffee();
    assertEquals(4, coffeeMaker.getCupsCoffee());
    assertEquals(0, coffeeMaker.getCupsWater());
    assertFalse(coffeeMaker.isOn());
  }

  @Test
  public void testPour() {
    coffeeMaker.addWater(4);
    coffeeMaker.addCoffee(2);
    coffeeMaker.turnOn();
    coffeeMaker.brewCoffee();
    coffeeMaker.pour(2);
    assertEquals(2, coffeeMaker.getCupsCoffee());
    assertThrows(IllegalStateException.class, () -> { coffeeMaker.pour(3); });
  }
}
