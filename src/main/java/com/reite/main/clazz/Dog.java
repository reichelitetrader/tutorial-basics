package com.reite.main.clazz;

public class Dog {
  private String name;
  private String colour;
  private int age = 0;

  public Dog(String name) {
    this.name = name;
  }

  public Dog() {
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void barking(int quantityBarking) {
    for (int i = 0; i < quantityBarking; i++)
      System.out.println("hau ");
    System.out.println("\n");
  }

  public String data() {
    String name = "", colour = "";
    if (this.name != null)
      name = this.name;
    if (this.colour != null)
      colour = this.colour;
    // (name != null ? name : "")
    // (colour != null ? colour : "")
    return "[" + name + ", " + colour + ", " + (2020 - age) + "]";
  }
}
