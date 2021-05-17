package com.reite.main.op.zad2;

public class Tank extends Tracked {
  public Tank(int productionYear, String engineType, String colour, int weight) {
    super(productionYear, engineType, colour, weight);
  }

//  @Override
//  public void startEngine() { //cant override this method because its final
//    super.startEngine();
//    System.out.println("this is tracked vehicle ");
//  }
}

