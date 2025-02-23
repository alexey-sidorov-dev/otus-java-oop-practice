package ru.otus.java.basic.practice;

import com.google.common.base.Joiner;

public class App {

  public static void main(String[] args) {
    Cat[] cats = new Cat[]{new Cat("Casper", 3), new Cat("Masik", 4),
        new Cat("Basik", 2)};
    Plate plate = new Plate(10);
    Joiner joiner = Joiner.on(" ");

    System.out.println(joiner.join("В тарелке имеется", plate.getCurrentVolume(), "еды"));
    for (Cat cat : cats
    ) {
      cat.eat(plate);
      System.out.println(
          joiner.join("Кот", cat.getName(), "с аппетитом", cat.getAppetite(),
              (cat.isSatiety() ? "" : "не ") + "наелся"));
      System.out.println("В тарелке осталось еды " + plate.getCurrentVolume());
    }

  }
}
