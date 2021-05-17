package com.reite.main.clazz;

//Write program which counted sum N-words seriesFibonacci, z1=0, z2=1,
// every each is sum of previouss elements
public class SeriesFibonacci {
  public void sumSeriesFibonacci(int n) {
    int sum = 0;
    int z1 = 0;
    int z2 = 1;
    int nast;
    for (int i = 2; i < n; i++) {  //from 2
      nast = (z1 + z2);
      sum += nast;
      z1 = z2;
      z2 = nast;
    }
    System.out.println("sum:" + sum);
  }

  public String checkNumber(int number) {
    return number > 0 ? "Tak" : "Nie";
  }
}


