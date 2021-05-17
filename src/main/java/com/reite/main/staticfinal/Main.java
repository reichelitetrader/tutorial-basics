package com.reite.main.staticfinal;

public class Main {
  public static void main(String[] args) {
    StaticClass.someField = "aaa";
    StaticClass.staticMethod();

    StaticClass s1 = new StaticClass();
    StaticClass s2 = new StaticClass();
    StaticClass s3 = new StaticClass();
    System.out.println(StaticClass.someField);

    AbstractClass abstractClass = new AbstractClass() {
      @Override
      void myAbstractMethod() {

      }

      @Override
      public void test() {
        super.test();
      }
    };
  }
}
