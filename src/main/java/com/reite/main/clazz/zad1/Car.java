package com.reite.main.clazz.zad1;

public class Car {
  private String brand;
  private Double capacity;
  private String line;
  private String model;
  private double price;
  private String destiny;

  public Car(String brand, double capacity, String line, String model, double price, String destiny) {
    this(brand, capacity, line);
    this.model = model;
    this.price = price;
    this.destiny = destiny;
  }

  public Car() {
  }

  public Car(String brand, Double capacity, String line) {
    this.brand = brand;
    this.capacity = capacity;
    this.line = line;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Double getCapacity() {
    return capacity;
  }

  public void setCapacity(Double capacity) {
    this.capacity = capacity;
  }

  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getDestiny() {
    return destiny;
  }

  public void setDestiny(String destiny) {
    this.destiny = destiny;
  }
}
