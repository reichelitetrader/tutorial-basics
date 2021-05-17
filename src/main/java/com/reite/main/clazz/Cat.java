package com.reite.main.clazz;

public class Cat {
  private String name;
  private String colour;
  private int age = 0;

  private int numberOfBreaths = 0;

  public Cat(String name) {
    this.name = name;
    System.out.println("New cat " + name + " born!");
  }

  public void breathing(Integer quantityOfBreathing) { // object can be null, primitive types can't be null
    if (quantityOfBreathing == null) { // security null pointer exception
      System.out.println("dead");
    } else {
      for (int i = 0; i < quantityOfBreathing; i++) {
        if (i == quantityOfBreathing - 1)
          System.out.print("breath");
        else
          System.out.print("breath, ");
      }
      System.out.println("...");
      this.numberOfBreaths += quantityOfBreathing;
    }
  }

  public String getStatus() {
    return "breaths: " + this.numberOfBreaths;
  }
}




