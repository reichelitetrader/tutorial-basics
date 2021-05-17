package com.reite.main.collections;

import com.reite.main.op.zad2.Vw;

import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int[] tab; // declaration
    int[] tab1 = {1, 2, 3}; // definition
    int[] tab2 = new int[2]; // definition get size

    Vw[] tabVws = new Vw[5];

    System.out.println(tab1[0]);
    tab1[1] = 10; // write in the value of index cells

    for (int i = 0; i < tab1.length; i++)
      System.out.println("element o indeksie " + i + " = " + tab1[i]); // wypisywanie el. w pętli

// Zad.24 Write code which will change tab3 array in new character, tip  i == j :)
// 1 0 0
// 0 1 0
// 0 0 1
//    int[][] tab3 = new int[10][10];
//    for (int i = 0; i < tab3.length; i++)
//      for (int j = 0; j < tab3.length; j++)
//        if (i == j)
//          tab3[i][j] = 1;
//        else
//          tab3[i][j] = 0;
//----------------------------------------------------------------------------------------------------------------
// Zad.25 Write code which will change tab3 arrays to new character
// 1 2 2
// 0 1 2
// 0 0 1
//    int[][] tab3 = new int[5][5];
//    for (int i = 0; i < tab3.length; i++)
//      for (int j = 0; j < tab3.length; j++)
//        if (i == j)
//          tab3[i][j] = 1;
//        else if (i < j)
//          tab3[i][j] = 2;
//        else
//          tab3[i][j] = 0;
//
//    for (int i = 0; i < tab3.length; i++) {
//      for (int j = 0; j < tab3.length; j++)
//        System.out.print(tab3[i][j] + "\t");
//      System.out.println();
//    }
//-----------------------------------------------------------------------------------------------
//Zad.26 Write code which sums the value of even elements of the tab3 array
    int[][] tab3 = new int[][]{{2, 3, 5}, {2, 4, 5}, {4, 6, 5}};
//    double sum = 0;
//    for (int i = 0; i < tab3.length; i++)
//      for (int j = 0; j < tab3.length; j++) {
//        if (tab3[i][j] % 2 == 0)
//          sum += tab3[i][j];
//      }
//    System.out.println(sum);
//-----------------------------------------------------------------------------------------------
//Zad.27 Sum the max element in the array when the user enter any value
//    System.out.println("get number:");
//    int getNumber = new Scanner(System.in).nextInt();
//    for (int i = 0; i < tab3.length; i++) {
//      for (int j = 0; j < tab3.length; j++) {
//        if (tab3[i][j] > getNumber)
//          sum += tab3[i][j];
//      }
//    }
//    System.out.println("sum elements of array:" + sum);
//-------------------------------------------------------------------------------------------------
//Zad.28 List the sum of the elements of each row
//    for (int i = 0; i < tab3.length; i++) {
//      for (int j = 0; j < tab3.length; j++) {
//        sum += tab3[i][j];
//      }
//      System.out.println("sum elements of :" + i + " row = " + sum);
//    }
//---------------------------------------------------------------------------------------------------------------------
//Zad.29 List the sum of elements of 2-dimensional array each columns
//    for (int i = 0; i < tab3.length; i++) {
//      for (int j = 0; j < tab3.length; j++) {
//        sum += tab3[i][j];
//     System.out.println("sum elements of:" + j + " column = " + sum);
//     j++;
//      }
//    }

//    for (int i = 0; i < tab3.length; i++){
//      double sum = 0;
//      for (int j = 0; j < tab3.length; j++)
//        sum += tab3[j][i];
//      System.out.println("Index is: " + i + " Sum is: "+sum);
//    }
//---------------------------------------------------------------------------------------------------------------------
//Zad.30 Sum the elements of 2-dimensional array on every 2nd row, konwencja programisty / wymagania biznesowe klienta
//    for (int i = 0; i < tab3.length; i+=2){ // wyrazenie z przypisaniem
//      double sum = 0;
//      for (int j = 0; j < tab3.length; j++)
//        sum += tab3[i][j];
//      System.out.println("Index is: " + i + " Sum is: "+sum);
//    }
//---------------------------------------------------------------------------------------------------------------------
//Zad.31 2tablice 2wymiarowye o podanym rozmiarze wypełnij losowymi wartościami, dodaj macierze i podaj wynik
    int size, min = 0, max = 10;
    String choiceOperation;


    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size of matrix:");
    size = scanner.nextInt();

    System.out.println("Choose the operation mark (+ , - , * , /):");
    Scanner scannerOp = new Scanner(System.in);
    choiceOperation = scannerOp.nextLine();
    int[][] tab5 = new int[size][size];
    int[][] tab6 = new int[size][size];


    Random random = new Random();
    for (int i = 0; i < tab5.length; i++) {
      for (int j = 0; j < tab5.length; j++) {
        tab5[i][j] = random.nextInt((max - min) + 1) + min;
        tab6[i][j] = random.nextInt((max - min) + 1) + min;
      }
    }
    calculateMatrix(tab5, tab6,  choiceOperation);


//Zad.36 wprowadz ciag znakow o zadanej wczesniej ilosci, czy ciąg jest palindromem?
//    int tabSize = 0;
//
//    Scanner scanner = new Scanner(System.in);
//    tabSize = scanner.nextInt();
//    char [] array = new char[tabSize];
//    boolean isPalindrome = true;
//    System.out.println("enter amount of letters: ");
//
//    for(int i = 0; i < tabSize; i++)
//      array[i] = new Scanner(System.in).nextLine().charAt(0);
//
//    for(int i = 0, j =tabSize-1; i < tabSize;i++, j--){   // wielkosc tablicy i numeracja ineksy
//      if(array[i] != array[j]) {
//        isPalindrome = false;
//        break;
//      }
//    }
//    System.out.println(isPalindrome);
//---------------------------------------------------------------------------------------------------------------------
//Zad.37 Get from user n-numbers, load with keyboard and write it in the array, count avg this loaded numbers
//    int n = 0;
//    double avg = 0;
//    double sum = 0;
//    System.out.println("enter numbers: ");
//    Scanner scanner = new Scanner(System.in);
//    n = scanner.nextInt();
//    int[] array = new int[n];
//    for (int i = 0; i < array.length; i++) {
//      array[i] = scanner.nextInt();   // wypelnienie tablicy
//      sum += array[i];
//    }
//    System.out.println("Avg: " + sum / array.length);
  }
  //---------------------------------------------------------------------------------------------------------------------
//Zad.32 Extend functionalities of method multiply and division, protect when the user enter don't right line command
//Zad.35 Change method calculateMatrix with construction statement if else if  change on switch case statement
  public static void calculateMatrix(int[][] tab5, int[][] tab6, String choiceOperation) {
    int result=0;

    for (int i = 0; i < tab5.length; i++) {
      for (int j = 0; j < tab6.length; j++) {
        try {

          if ("*".equals(choiceOperation)) {
            result = tab5[i][j] * tab6[j][i];
            System.out.print(result + "\t" );
          } else if ("/".equals(choiceOperation)) {
            result = tab5[i][j] / tab6[i][j];
            System.out.print(result + "\t");
          } else if ("+".equals(choiceOperation)) {
            result = tab5[i][j] + tab6[i][j];
            System.out.print(result + "\t");
          } else if (("-".equals(choiceOperation))) {
            result = tab5[i][j] - tab6[i][j];
            System.out.print(result + "\t");
          }

        } catch (NumberFormatException exc ) {
          System.out.println("enter right parameter");

        }
      }
      System.out.println("");
    }
  }
}