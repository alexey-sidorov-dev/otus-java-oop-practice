package ru.otus.java.basic.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CatTest {

  @ParameterizedTest(name = "{index} - create cat with appetite {0}")
  @CsvSource(value = {
      "Casper,-999", "Casper,0",
      "Casper,10", "Casper,999",
  })
  void testConstructor(String name, int appetite) {
    Cat cat = new Cat(name, appetite);
    Assertions.assertEquals(Math.max(appetite, 0), cat.getAppetite());
    Assertions.assertEquals(name, cat.getName());
  }

  @ParameterizedTest(name = "{index} - cat with appetite {1} eats from plate with current volume {2}")
  @CsvSource(value = {
      "Casper,0,0,true", "Casper,0,10,true",
      "Casper,5,10,true", "Casper,10,5,false"
  })
  void testEat(String name, int appetite, int maxVolume, boolean result) {
    Cat cat = new Cat(name, appetite);
    Plate plate = new Plate(maxVolume);
    cat.eat(plate);

    Assertions.assertEquals(cat.isSatiety(), result);
  }
}