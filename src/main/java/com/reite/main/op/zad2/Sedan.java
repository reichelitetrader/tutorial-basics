package com.reite.main.op.zad2;

public class Sedan extends Personal {
  private String model;
  private String symbol;


  public Sedan(int productionYear, String engineType, String colour, int weight, String sizeOfWheels, int numberOfPeople, String model, String symbol) {
    super(productionYear, engineType, colour, weight, sizeOfWheels, numberOfPeople);
    this.model = model;
    this.symbol = symbol;
  }


}
