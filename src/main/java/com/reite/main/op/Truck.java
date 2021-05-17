package com.reite.main.op;

public class Truck extends Vehicle{
  private int praiseTr;

  Truck(String brand, double capacity, int colour, int praiseTr){
    super(brand, capacity, colour); // WYWOLANIE KONTRUKTOR Z KLASY BAZOWEJ ZEBY USTAWIC WSZYSTKIE WLASCIWOSCI Z KLASY BAZOWEJ
    this.praiseTr = praiseTr;
  }

  public int getPraiseTr() {
    return praiseTr;
  }

  public void setPraiseTr(int praiseTr) {
    this.praiseTr = praiseTr;
  }
}
