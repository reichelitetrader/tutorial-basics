package com.reite.main.op;

public class InheritanceBase {
  private String name;

  InheritanceBase() {
    System.out.println("Constructor InheritanceBase");
  }

  private void privateMethod(){

  }

  protected void protectedMethod(){

  }

  public void doSth() {
    System.out.println("Do something!");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
