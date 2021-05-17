package com.reite.main.clazz;
//write metod which show quadratic equation, metod have 3 arguments of type double, use a,b,c factors
public class QCalculator {

  public void calculate(double a, double b, double c) {
    if (a == 0) {
    score(a,b,c);
      System.out.println("is not a quadratic function: ");
    } else {
      System.out.println("I calculate zero places: ");
      score(a,b,c);
    }
  }

  public static double countDelta(double a, double b, double c) {  //b2 * -4(ac)
    return (b * b) - 4 * a * c;
  }

  public static void score(double a, double b, double c){
  double x1 =0;
  double x2 = 0;
  double delta = countDelta(a, b, c);

  if(delta == 0) {
    x1 = (-b/(2*a));
    System.out.println("one solution:" + x1);
  }
  if(delta >0){
    x1 = ((-b-Math.sqrt(delta))/2*a);
    x2 = ((-b+Math.sqrt(delta))/2*a);
    System.out.println("two solution:" + "x1="+  x1 + " " +"x2=" + x2);
  }
if(delta <0){
  System.out.println("any solution: ");
}
  }
}
