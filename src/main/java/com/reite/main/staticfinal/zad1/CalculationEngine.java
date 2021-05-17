package com.reite.main.staticfinal.zad1;

import java.util.ArrayList;
import java.util.List;

public class CalculationEngine extends Calculations {
  @Override
  public double calculate(double numberOne, double numberTwo, String operation) throws ArithmeticException {
    return calculate(new double[]{numberOne, numberTwo}, operation);
  }

  public double calculate(String message1, String message2, String operation) throws ArithmeticException {
    double[] params;
    if (message2 == null || "".equals(message2))
      params = new double[]{Double.valueOf(message1)};
    else
      params = new double[]{Double.valueOf(message1), Double.valueOf(message2)};

    return calculate(params, operation);
  }

  public double calculate(double[] array, String operation) throws ArithmeticException {
    double result = array[0];
    int startIndex = array.length == 1 ? 0 : 1; // shorter if condition
    for (int index = startIndex; index < array.length; index++) {
      if ("-".equals(operation)) {
        result -= array[index];
      } else if ("*".equals(operation)) {
        result *= array[index];
      } else if ("+".equals(operation)) {
        result += array[index];
      } else if ("/".equals(String.valueOf(operation))) {
        if (array[index] != 0)
          result /= array[index];
        else
          throw new ArithmeticException("Divided by zero exception");
      } else if ("%".equals(String.valueOf(operation))) {
        result %= array[index];
      } else if ("cos".equals(operation)) {
        result = Math.cos(array[0]);

      } else if ("sin".equals(operation)) {
        result = Math.cos(array[0]);
      } else if ("tg".equals(operation)) {
        result = Math.cos(array[0]);
      } else if ("ctg".equals(operation)) {
        result = Math.cos(array[0]);
      }
    }
    return result;
  }

  public double findMin(String[] array) {
    double min = Double.valueOf(array[0]);
    for (int i = 1; i < array.length; i++) {
      if (Double.valueOf(array[i]) < min) {
        min = Double.valueOf(array[i]);
      }
    }
    return min;
  }

  public double findMax(String[] array) {
    double max = Double.valueOf(array[0]);
    for (int i = 0; i < array.length; i++) {
      if (Double.valueOf(array[i]) > max) {
        max = Double.valueOf(array[i]);
      }
    }
    return max;
  }

  public Double[] findEvenNumbers(String[] array) {
    List<Double> evenNumbers = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      if (Double.valueOf(array[i]) % 2 == 0) {
        evenNumbers.add(Double.valueOf(array[i]));
      }
    }
    return evenNumbers.toArray(new Double[evenNumbers.size()]);
  }

}
