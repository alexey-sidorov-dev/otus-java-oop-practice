package ru.otus.java.basic.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class PlateTest {

  @ParameterizedTest(name = "{index} - create plate with {0} maximum volume")
  @ValueSource(ints = {Integer.MIN_VALUE, -10, 0, 10, Integer.MAX_VALUE})
  void testConstructor(int volume) {
    Assertions.assertEquals(Math.max(volume, 0), new Plate(volume).getCurrentVolume());
  }

  @ParameterizedTest(name = "{index} - reduce {1} food from plate with {0} maximum volume")
  @CsvSource(value = {
      "-9999,-10,true", "-9999,0,true", "-9999,10,false",
      "-10,-10,true", "-10,0,true", "-10,10,false",
      "0,-10,true", "0,0,true", "0,10,false",
      "10,-10,true", "10,0,true", "10,10,false",
      "9999,-10,true", "9999,0,true", "9999,10,true"
  })
  void testReduce(int maxVolume, int volume, boolean result) {
    Plate plate = new Plate(maxVolume);
    Assertions.assertEquals(result, plate.reduce(volume));
  }

  @ParameterizedTest(name = "{index} - add {1} and {2} food to plate with {0} maximum volume")
  @CsvSource(value = {
      "-9999,-10,10", "-9999,0,-10", "-9999,10,11",
      "-10,-10,10", "-10,0,-10", "-10,10,11",
      "0,-10,10", "0,0,-10", "0,10,11",
      "10,-10,10", "10,0,-10", "10,10,11",
      "9999,-10,10", "9999,0,-10", "9999,10,11"
  })
  void testAdd(int maxVolume, int volume1, int volume2) {
    Plate plate = new Plate(maxVolume);
    plate.add(volume1);
    Assertions.assertEquals(
        Math.min(plate.getCurrentVolume() + Math.max(volume1, 0), Math.max(maxVolume, 0)),
        plate.getCurrentVolume());
    plate.add(volume2);
    Assertions.assertEquals(
        Math.min(plate.getCurrentVolume() + Math.max(volume1, 0) + Math.max(volume2, 0),
            Math.max(maxVolume, 0)),
        plate.getCurrentVolume());
  }
}
