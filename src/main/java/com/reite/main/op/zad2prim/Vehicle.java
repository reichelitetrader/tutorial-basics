package com.reite.main.op.zad2prim;

public class Vehicle { // private,protected you don't use private access modifier here
  private int productionYear;
  private String engineType;
  private String colour;
  private int weight;

  public Vehicle(int productionYear, String engineType, String colour, int weight) {
    this.productionYear = productionYear;
    this.engineType = engineType;
    this.colour = colour;
    this.weight = weight;
  }

  private class Test {

  }

  public void startEngine() {
    System.out.println("engine started");
  }

  public int getProductionYear() {
    return productionYear;
  }

  public void setProductionYear(int productionYear) {
    this.productionYear = productionYear;
  }

  public String getEngineType() {
    return engineType;
  }

  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}
