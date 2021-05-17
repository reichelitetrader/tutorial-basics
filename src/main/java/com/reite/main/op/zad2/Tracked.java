package com.reite.main.op.zad2;

import com.reite.main.op.zad2prim.Vehicle;

public class Tracked extends Vehicle {
  private int powerOfEngine;

  public Tracked(int productionYear, String engineType, String colour, int weight) {
    super(productionYear, engineType, colour, weight);
  }

  @Override
  public final void startEngine() {
    super.startEngine();
    System.out.println("this is tracked vehicle ");
  }

  public int getPowerOfEngine() {
    return powerOfEngine;
  }

  public void setPowerOfEngine(int powerOfEngine) {
    this.powerOfEngine = powerOfEngine;
  }
}
