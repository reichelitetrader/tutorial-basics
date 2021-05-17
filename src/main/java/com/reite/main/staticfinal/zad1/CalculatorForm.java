package com.reite.main.staticfinal.zad1;

import lombok.Getter;

import javax.swing.*;

@Getter
public class CalculatorForm {
    private JFrame frame; // top level containers, adds support for element architecture
    private JTextField textFieldNumberOne;
    private JTextField textFieldOperation;
    private JTextField textFieldNumberTwo;
    private JButton buttonResultCalculate; // customizable action button
    private JPanel panel;  //lightweight container
    private JTextField textFieldResult;
    private JTextField textFieldHistory;  //component allows display single line of text
    private JCheckBox checkBoxModify;


  public CalculatorForm() {
        frame = new JFrame("CalculatorForm");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // if true, makes the Window visible
        frame.pack(); //Window to be sized to fit the preferred size

    }
}
