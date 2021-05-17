package com.reite.main.op.zad2;

import com.reite.main.op.zad2prim.Vehicle;

public class Rail extends Vehicle {
  private static String owner = "P.K.P"; // declare static field, gdy kompilujemy

  public Rail(int productionYear, String engineType, String colour, int weight) {
    super(productionYear, engineType, colour, weight);

  }

  @Override
  public void startEngine() {
    System.out.println("railway vehicle engine started ");
  }
}
