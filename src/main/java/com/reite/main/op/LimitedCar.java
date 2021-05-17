package com.reite.main.op;

public class LimitedCar extends Car {
  private int maxSpeed = 50;

  public LimitedCar(String brand, double capacity, int colour, String line) {
    super(brand, capacity, colour, line);
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

}
