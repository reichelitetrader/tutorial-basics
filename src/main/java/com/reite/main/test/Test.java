package com.reite.main.test;

public class Test {
  //SIMPLE TYPES
  int size = 0;
  double level = 0;
  short sizeA = 0;
  long distance = 0;
  char a = 'q';
  boolean status = false;

  double[] array;
  int[] tab;
  short[] tab1;
  long[] tab2;

  String withKeyboard = " ";

  Test(int size, double level, short sizeA, long distance) {
    this.size = size;
    this.level = level;
    this.sizeA = sizeA;
    this.distance = distance;

  }

  public Test() {

  }


  Test(double[] array, int[] tab, short[] tab1, long[] tab2) {
    this.array = array;
    this.tab = tab;
    this.tab1 = tab1;
    this.tab2 = tab2;
  }


  Test(int size, double level, short sizeA, long distance, char a, boolean status, double[] array, int[] tab, short[] tab1, long[] tab2, String withKeyboard) {
    this(size, level, sizeA, distance);  // wywolanie z innego konstrutora tej klasy
    this.a = a;
    this.status = status;
    this.array = array;
    this.tab = tab;
    this.tab1 = tab1;
    this.tab2 = tab2;
    this.withKeyboard = withKeyboard;
  }

  // ustawianie wartosci pól 1)za pomoca konstruktorów, 2)bezporędnio, 3)metody
  public void testMethod(boolean status) {
    this.status = status;
  }

  public void zeroSettings(){
    this.a = 0;
    this.status = false;
    this.array = new double[]{};
    this.tab = new int[]{};
    this.tab1 = new short[]{};
    this.tab2 = new long[]{};
    this.withKeyboard = withKeyboard;
  }

}
