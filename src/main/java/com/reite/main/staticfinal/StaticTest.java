package com.reite.main.staticfinal;

public class StaticTest {
  public static String name = "Test";

  public void print() {
    System.out.println(StaticTest.name);
  }

  public static void test() {
     //print();
  }

  public void test1() {
    print();
    test();
  }
}
