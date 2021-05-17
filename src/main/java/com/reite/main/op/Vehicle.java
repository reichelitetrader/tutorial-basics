package com.reite.main.op;

public class Vehicle {
  private String brand;
  private double capacity;
  private int colour;

  public Vehicle(String brand, double capacity, int colour) { //przeladowanie konstruktora
    this.brand = brand;
    this.capacity = capacity;
    this.colour = colour;
  }

  public Vehicle() {
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public double getCapacity() {
    return capacity;
  }

  public void setCapacity(double capacity) {
    this.capacity = capacity;
  }

  public int getColour() {
    return colour;
  }

  public void setColour(int colour) {
    this.colour = colour;
  }
}
