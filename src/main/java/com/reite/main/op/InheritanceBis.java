package com.reite.main.op;

public class InheritanceBis extends InheritanceBase {
  InheritanceBis() {
    //super();
    System.out.println("Constructor InheritanceBis");
  }

  public void doSomeMagic() {
    System.out.println("Doing magic in InheritanceBis");
  }

  // przesłanianie, nadpisywanie, override
  @Override
  public void doSth() {
    //super.doSth();
    System.out.println("Some additional things in child class :)");
  }

  // przeładowanie, overloading
  public void doSth(String sth) {
    System.out.println("Some additional things in child class :) " + sth);
  }

  public void doSth(int sth) {
    System.out.println("Some additional things in child class :) " + sth);
  }
}
