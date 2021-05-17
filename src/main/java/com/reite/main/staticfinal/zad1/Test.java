package com.reite.main.staticfinal.zad1;

import lombok.Getter;

import javax.swing.*;

@Getter
public class Test {
  private JFrame frame;
  private JPanel panel;
  private JTextField textFieldNumberOne;
  private JTextField textFieldNumberTwo;
  private JTextField textFieldOperation;
  private JCheckBox checkBoxMultiNumbers;
  private JTextField textFieldResult;
  private JTextField textFieldHistory;
  private JButton resultCalculateButton;
  private JButton averageButton;
  private JButton minButton;
  private JButton maxButton;
  private JButton ifEvenButton;
  private JButton isFiendlyButton;
  private JButton isPerfectButton;
  private JTextField textFieldA;
  private JTextField textFieldB;
  private JTextField textFieldC;

  public Test() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    frame = new JFrame("Calculator");
    frame.setContentPane(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
