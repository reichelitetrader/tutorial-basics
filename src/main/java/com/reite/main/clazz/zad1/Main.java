package com.reite.main.clazz.zad1;

public class Main {
  public static void main(String[] args) {
    Car mercedes = new Car ();
    Car audi = new Car (null, 2.5, "A6");
    Car fiat = new Car( "Fiat", null, null);
    Car honda = new Car("honda",1.8,"civic");
    Car mazda = new Car("mazda",null, null);
    Car bmw = new Car("bmw", 3.0, "7");
    audi.setBrand("Audi");
    fiat.setCapacity(2.0);
    fiat.setLine("punto");
    mazda.setCapacity(2.5);
    mazda.setLine("6");
    String hondaBrand = honda.getBrand();
  }


}
