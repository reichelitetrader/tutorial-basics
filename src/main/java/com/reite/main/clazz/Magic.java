package com.reite.main.clazz;

public class Magic {
  private int mag = 0;

  public Magic() {
    System.out.println("create magic!");
  }

  public Magic(Magic magic) {
    System.out.println("create magic out of magic !");
    this.mag = magic.mag;
  }

  public void setMagic(int magic) {
    this.mag = magic;
  }

  public void doMagic(int count) {
    for (int j = 0; j < count; j++)
      System.out.print("Abra kanabra " + mag + "! ");
    System.out.print("\n");
  }

  public void copyMagic(Magic mmm) {
    System.out.println("a copy of magic!");
    this.mag = mmm.mag;
  }
}
