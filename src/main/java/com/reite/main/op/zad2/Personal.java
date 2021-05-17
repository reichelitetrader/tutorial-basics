package com.reite.main.op.zad2;

public class Personal extends Wheeled {
  private int numberOfPeople;

  public Personal(int productionYear, String engineType, String colour, int weight, String sizeOfWheels,int numberOfPeople) {
    super(productionYear, engineType, colour, weight, sizeOfWheels);
    this.numberOfPeople = numberOfPeople;
  }

  public int getNumberOfPeople() {
    return numberOfPeople;
  }

  public void setNumberOfPeople(int numberOfPeople) {
    this.numberOfPeople = numberOfPeople;
  }
}
