package ru.otus.java.basic.practice;

public class Plate {

  private final int maxVolume;
  private int currentVolume;

  public int getCurrentVolume() {
    return currentVolume;
  }

  public Plate(int maxVolume) {
    this.maxVolume = currentVolume = Math.max(maxVolume, 0);
  }

  public void add(int volume) {
    if (volume <= 0) {
      return;
    }
    currentVolume = Math.min(currentVolume + volume, maxVolume);
  }

  public boolean reduce(int volume) {
    if (volume <= 0) {
      return true;
    }
    currentVolume = Math.max(currentVolume - volume, 0);

    return currentVolume - volume >= 0;
  }
}
