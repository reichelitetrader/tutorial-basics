package com.reite.main.op.zad2;

public class Truck extends Wheeled {
  private double liftingCapacity;

  public Truck(int productionYear, String engineType, String colour, int weight, String sizeOfWheels) {
    super(productionYear, engineType, colour, weight, sizeOfWheels);
  }

  public double getLiftingCapacity() {
    return liftingCapacity;
  }

  public void setLiftingCapacity(double liftingCapacity) {
    this.liftingCapacity = liftingCapacity;
  }
}
