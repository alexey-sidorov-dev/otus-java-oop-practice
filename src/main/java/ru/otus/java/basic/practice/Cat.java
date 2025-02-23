package ru.otus.java.basic.practice;

public class Cat {

  private final String name;
  private final int appetite;
  private boolean satiety;

  public String getName() {
    return name;
  }

  public int getAppetite() {
    return appetite;
  }

  public boolean isSatiety() {
    return satiety;
  }

  public Cat(String name, int appetite) {
    this.name = name;
    this.appetite = Math.max(appetite, 0);
    this.satiety = false;
  }

  public void eat(Plate plate) {
    this.satiety = this.appetite <= plate.getCurrentVolume();
    plate.reduce(this.appetite);
  }
}
