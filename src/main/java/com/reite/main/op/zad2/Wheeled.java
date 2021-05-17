package com.reite.main.op.zad2;

import com.reite.main.op.zad2prim.Vehicle;

public class Wheeled extends Vehicle {
  private String sizeOfWheels;

  public Wheeled(int productionYear, String engineType, String colour, int weight, String sizeOfWheels) {
    super(productionYear, engineType, colour, weight);
    this.sizeOfWheels = sizeOfWheels;
  }

  //ovveride nadpisanie metody z klasy bazowej,
  public void startEngine(String engineType) { // przeladowanie metody z innymi parametrami
    System.out.println(engineType + " engine started");
  }

  public String getSizeOfWheels() {
    return sizeOfWheels;
  }

  public void setSizeOfWheels(String sizeOfWheels) {
    this.sizeOfWheels = sizeOfWheels;
  }
}
