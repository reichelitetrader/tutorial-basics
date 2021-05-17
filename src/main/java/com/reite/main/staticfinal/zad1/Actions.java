package com.reite.main.staticfinal.zad1;

import javax.swing.*;

public class Actions {
  private Test calculatorForm;
  private String lastCalculation = "";
  private CalculationEngine calculator = new CalculationEngine();

  public void control() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {  // metoda control dla aktywnej actions wykonanie musi sie wykonac raz raz
    openCalculatorForm();

//tworzenie geterow celem dostepnosci do pol klasy
    calculatorForm.getResultCalculateButton().addActionListener(e -> onClickButtonResultCalculate());
    calculatorForm.getCheckBoxMultiNumbers().addActionListener(e -> onChangeCheckBoxModify());
    calculatorForm.getAverageButton().addActionListener(e -> onClickButtonResultAverage());
    calculatorForm.getMinButton().addActionListener(e -> onClickButtonMin());
    calculatorForm.getMaxButton().addActionListener(e -> onClickButtonMax());
    calculatorForm.getIfEvenButton().addActionListener(e -> onClickIfEvenNumbers());
    calculatorForm.getIsFiendlyButton().addActionListener(e -> onClickIsFriendlyNumbers());
    calculatorForm.getIsPerfectButton().addActionListener(e -> onClickIsPerfectNumber());
    calculatorForm.getResultCalculateButton().addActionListener( e -> onClickCalculateQuadraticFunction());

  }
  //calculate zero places quadratic function
  private void onClickCalculateQuadraticFunction() {
    double a=Double.valueOf(calculatorForm.getTextFieldA().getText());
    double b =Double.valueOf(calculatorForm.getTextFieldB().getText());
    double c = Double.valueOf(calculatorForm.getTextFieldC().getText());
    double x1=0;
    double x2=0;
    double delta = b*b - 4*a*c;

    if(delta<0){
      calculatorForm.getTextFieldResult().setText("there is no zero places");
    } else if (delta ==0){
      x1 = -b/(2*a);
      calculatorForm.getTextFieldResult().setText(x1 + " "  + x2);

    } else if (delta>0){
      x1 = (-b+Math.sqrt(delta))/2*a;
      x2= (-b-Math.sqrt(delta))/2*a;
      calculatorForm.getTextFieldResult().setText(x1 + " "  + x2);
    }

  }


  //czy liczba jest doskonala
private void onClickIsPerfectNumber() {
  double number=0;
  double sum = 0;
  boolean isFriendlyCondition = false;
  Double var1 = Double.valueOf(calculatorForm.getTextFieldNumberOne().getText());

  for (int i = 0; i <= var1; i++) {
    if (var1 % i == 0) {
      sum += i;
    }
  }

  if (sum == number) {
    isFriendlyCondition = true;
    calculatorForm.getTextFieldResult().setText("YES IS PERFECT");
  } else {
    calculatorForm.getTextFieldResult().setText("NO IS NOT PERFECT");
  }
}



  // dla ktorych suma dzielnikow obu liczb jest taka sama
  private void onClickIsFriendlyNumbers() {
    double sum1 = 0;
    double sum2 = 0;
    boolean isFriendlyCondition = false;
    Double var1 = Double.valueOf(calculatorForm.getTextFieldNumberOne().getText());
    Double var2 = Double.valueOf(calculatorForm.getTextFieldNumberTwo().getText());

    calculatorForm.getCheckBoxMultiNumbers().isSelected();
    for (int i = 0; i <= var1; i++) {
      if (var1 % i == 0) {
        sum1 += i;
      }
    }
    for (int j = 0; j <= var2; j++) {
      if (var2 % j == 0) {
        sum2 += j;
      }
    }
    if (sum1 == sum2) {
      isFriendlyCondition = true;
      calculatorForm.getTextFieldResult().setText("YES");
    } else {
      calculatorForm.getTextFieldResult().setText("NO");
    }

  }


  public void openCalculatorForm() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
    if (calculatorForm == null || (calculatorForm != null && !calculatorForm.getFrame().isDisplayable())) {
      calculatorForm = new Test();
      calculatorForm.getFrame().setVisible(true);
    } else {
      calculatorForm.getFrame().toFront();
    }
  }

  public void onClickButtonResultCalculate() {
    String result = "";
    calculatorForm.getTextFieldHistory().setText(lastCalculation);
    if (calculatorForm.getCheckBoxMultiNumbers().isSelected()) {
      String[] splitNumbers = calculatorForm.getTextFieldNumberOne().getText().split(",");
      double[] numbers = new double[splitNumbers.length];
      for (int i = 0; i < splitNumbers.length; i++)
        numbers[i] = Double.valueOf(splitNumbers[i]);
      result = String.valueOf(calculator.calculate(numbers, calculatorForm.getTextFieldOperation().getText()));
      calculatorForm.getTextFieldResult().setText(result);
    } else {
      result = String.valueOf(calculator.calculate(calculatorForm.getTextFieldNumberOne().getText(), calculatorForm.getTextFieldNumberTwo().getText(), calculatorForm.getTextFieldOperation().getText()));
      calculatorForm.getTextFieldResult().setText(result);
    }
    lastCalculation = result;
  }

  public void onChangeCheckBoxModify() {
    calculatorForm.getTextFieldNumberTwo().setEnabled(!calculatorForm.getCheckBoxMultiNumbers().isSelected());
  }

  public void onClickButtonResultAverage() {
    String result = "";
    if (calculatorForm.getCheckBoxMultiNumbers().isSelected()) {
      String[] splitNumbers = calculatorForm.getTextFieldNumberOne().getText().split(",");
      double[] numbers = new double[splitNumbers.length];
      for (int i = 0; i < splitNumbers.length; i++)
        numbers[i] = Double.valueOf(splitNumbers[i]);
      result = String.valueOf(calculator.calculate(calculator.calculate(numbers, "+"), Double.valueOf(numbers.length).doubleValue(), "/"));
      calculatorForm.getTextFieldResult().setText(result);
    }

  }

  public void onClickButtonMin() {
    if (calculatorForm.getCheckBoxMultiNumbers().isSelected()) {
      String[] splitNumbers = calculatorForm.getTextFieldNumberOne().getText().split(",");
      calculatorForm.getTextFieldResult().setText(String.valueOf(calculator.findMin(splitNumbers)));
    }
  }

  public void onClickButtonMax(){
    if(calculatorForm.getCheckBoxMultiNumbers().isSelected()){
      String[] splitNumbers = calculatorForm.getTextFieldNumberOne().getText().split(",");
      calculatorForm.getTextFieldResult().setText(String.valueOf(calculator.findMax(splitNumbers)));
    }
  }

  public void onClickIfEvenNumbers(){
    if(calculatorForm.getCheckBoxMultiNumbers().isSelected()){
      String[] splitNumbers = calculatorForm.getTextFieldNumberOne().getText().split(",");
      String result = new String();
      for(Double number : calculator.findEvenNumbers(splitNumbers))
        result += (number.toString() + " ");
      calculatorForm.getTextFieldResult().setText(result);
    }
  }



}
