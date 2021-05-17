package com.reite.main.op;

public class Car extends Vehicle{
  private String line;

  public Car(String brand, double capacity, int colour, String line) {
    super(brand, capacity, colour);
    this.line = line;
  }


}
