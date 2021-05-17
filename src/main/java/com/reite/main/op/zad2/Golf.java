package com.reite.main.op.zad2;

public class Golf extends Vw {
  public Golf(int productionYear, String engineType, String colour, int weight, String sizeOfWheels, int numberOfPeople, String model, String symbol) {
    super(productionYear, engineType, colour, weight, sizeOfWheels, numberOfPeople, model, symbol);
  }

  public Golf(int productionYear, String engineType, String colour, int weight, String sizeOfWheels, int numberOfPeople) {
    super(productionYear, engineType, colour, weight, sizeOfWheels, numberOfPeople, null, null);
  }
}
