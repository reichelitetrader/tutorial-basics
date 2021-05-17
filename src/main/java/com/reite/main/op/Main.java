package com.reite.main.op;

public class Main {
  public static void main(String[] args) {
    Hermetization hermetization = new Hermetization();
    hermetization.getProtect();
    hermetization.setProtect("Fun");

    InheritanceCis inheritanceCis = new InheritanceCis();
    InheritanceBis inheritanceBis = new InheritanceBis();
    inheritanceBis.doSth();
    inheritanceCis.doSth();
    inheritanceBis.doSomeMagic();
    inheritanceCis.specialOne();

    Integer i = new Integer(1);
  }
}
