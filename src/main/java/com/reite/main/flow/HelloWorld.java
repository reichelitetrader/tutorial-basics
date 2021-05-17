package com.reite.main.flow;

public class HelloWorld {
  public static void main(String[] args) {
//        System.out.println("hello world");
//        int number;           // Declaration
//        number = 6;           // Definition
//        if (1 > 0) number += 1;
//        for (int count = 0; count < 1; count++) {
//        }
//        int count = 1;
//        Integer anotherNumber = 1;
// Data Flow Instructions,conditions-if/else if/else + switch, loops (for,while,do while,foreach)
//-------------------------------------------------------------------------------------------------------------
//zad1.write program which that prints next squares of even numbers with out of scope (1,100)
//        for (int i = 2; i <= 100; i += 2)
//            System.out.println(i * i);
//--------------------------------------------------------------------------------------------------------------
//zad2.write a program which prints all numbers which are divisible by14 witch out of scope (20,30 )
//        for (int i = 20; i <= 30; i++)
//            if (i % 14 == 0)
//                System.out.println("liczba " + i + " jest podzielna przez 14");
//---------------------------------------------------------------------------------------------------------------
//zad3.Print of console display this type of shape
// *
// **
// ***
// ****
// *****
// ******
// *****
// ****
// ***
// **
// *
//    int z = 5;
//    for (int i = 0; i < 12; i++) {
//    if (i < 6)
//    for (int j = 0; j < i + 1; j++)
//    System.out.print("*");
//    else {
//    for (int j = 0; j < z; j++)
//    System.out.print("*");
//    z--;
//    }
//    System.out.println();
//    }
//---------------------------------------------------------------------------------------------------------------
//zad4.Write program which for given letter prints their coded value, which is shifted 3 agree with ASCII table,
//handle only small letter "z" , you should changes on 'c', 'y' na 'b', 'x' na 'a' wraping because of the end of alfabet
//        char b = 'b';
//        b += 3;
//        System.out.println(b); // 'e'
//
//        char encoded = 'f';
//        switch (encoded) {
//            case 'x':
//                encoded = 'a';
//                break;
//            case 'y':
//                encoded = 'b';
//                break;
//            case 'z':
//                encoded = 'c';
//                break;
//            default:
//                encoded += 3;
//                break;
//        }
//        System.out.println(encoded);      // coded value for 'b' -> 'e'

//        int tab[] = {1, 3, 6, 2, 1};      //definicja (inicjalizacja)
//        int tab1[] = new int[3];          //definicja
//        double dTab[];                     //deklaracja
//        tab[2] = 100;                     //wpisywanie wartosci do tablicy
//
//        for (int i = 0; i < tab.length; i++) // wypisywanie wartości tablicy
//            System.out.println(tab[i]);
//--------------------------------------------------------------------------------------------------------------------
//zad5.Fill the arrays tab1 values 1
//        for (int i = 0; i < tab1.length; i++) // 0, 1, 2
//            tab1[i] = 1;
//---------------------------------------------------------------------------------------------------------------------
//zad6.Fill every other cell arrays tab value 100, score of working programs the contents of array: 1 100 6 100 1
// for( start; condition; step)
// for(int i = 0; i < 100; i += 2) /* ... */
// int j = 10;
// for(;; j -= 1) if(j == 5) break;
// for(int i = 0, j = 5; ; i = i + 2 * j) if(i <= 1000) break;
// long tab[] = new long[7];
// for(int i = 0; i < tab.length; i += 2) /* ... */
// for(int i =0; i<tab.length ;i = i+2){
// tab[i] =  100;
// }
//
// System.out.println("----------------------------");
// for(int i=0; i<tab.length; i++){
// System.out.println(tab[i]);
//  }
//--------------------------------------------------------------------------------------------------------------------
//zad7.Write the following numbers in the console disply in vertical 1,2,3,4,5
//     for(int i =0, j = 0; i < 150 ; i++) {
//     if(j >= 100 && j <= 101 || j >= 110 && j <= 111) {
//     System.out.println("a");
//     }
//     j++;
//     }
//--------------------------------------------------------------------------------------------------------------------
//zad8.Write in a loop use operator *= all the power of a number in this out of scope(9,15)inclusive and (21,27) inc
//        for (int i = 0, j = 0; i <= 27; i += 3, j += 3) {
//            if ((j >= 9 && j <= 15) || (j >= 21 && j <= 27))
//                System.out.println("Ho ho ho ho"); // 3x i 3x
//        }
//--------------------------------------------------------------------------------------------------------------------
//zad9.Write the power of 3 to 27 inclusive
//        for (int i = 1; i <= 27; i *= 3)
//            System.out.println(i);

//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++)
//                System.out.print(i * j + "\t");
//            System.out.print("\n");
//        }
//--------------------------------------------------------------------------------------------------------------------
//zad10.Matrix Arrays
//        double[][] matrix1 = {{2.0, 1.0}, {2.1, 3.0}};
//        double[][] matrix2 = {{4.0, 2.0}, {1.1, 0.0}};
//        double[][] result = new double[2][2];
//
//        for (int numerWiersza = 0; numerWiersza < 2; numerWiersza++)
//            for (int numerKolumny = 0; numerKolumny < 2; numerKolumny++) {
//                result[numerWiersza][numerKolumny] = matrix1[numerWiersza][numerKolumny] + matrix2[numerWiersza][numerKolumny];
//            }
//
//        for (int numerWiersza = 0; numerWiersza < 2; numerWiersza++) {
//            for (int numerKolumny = 0; numerKolumny < 2; numerKolumny++)
//                System.out.print(result[numerWiersza][numerKolumny] + "\t");
//            System.out.print("\n");
//        }
//---------------------------------------------------------------------------------------------------------------------
//zad11.Is the given String is palindrome?
//        char[] tab = {'k', 'o', 'b', 'y', 'l', 'a', 'm', 'a', 'm', 'a', 'l', 'y', 'b', 'o', 'k'};
//        boolean isPalindrome = true;
//        for (int i = 0, j = tab.length - 1; i < tab.length; i++, j--)
//            if (tab[i] != tab[j]) {
//                isPalindrome = false;
//                break;
//            }
//        System.out.println(isPalindrome);
//--------------------------------------------------------------------------------------------------------------------
//zad12.Find max value in the array?
//        int[] array = {1, 2, 6, 4, 3, 2};
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//            }
//        }
//        System.out.println("max: " + max);
//------------------------------------------------------------------------------------------------------------------
//zad13. Find min value in the array?
//        int min = array[0];
//        for(int i=0; i<array.length; i++){
//            if(min > array[i]){
//                min = array[i];
//            }
//        }
//        System.out.println("min: " + min);
//-----------------------------------------------------------------------------------------------------------------
//zad14.Find min/max value in the array?
//        int[] array = {1, 2, 6, 4, 3, 2};
//        int min = array[0];
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (min > array[i])
//                min = array[i];
//            if (max < array[i])
//                max = array[i];
//        }
//        System.out.println("min: " + min);
//        System.out.println("max: " + max);
//------------------------------------------------------------------------------------------------------------------
//zad15.Find min/max in the array, list in console the index of the last elements min/max in the array
//        int[] tab = {1, 2, 6, 1, 4, 3, 8};
//        int indexMin = 0;
//        int indexMax = 0;
//        int min = tab[0];
//        int max = tab[0];
//        for (int i = 0; i < tab.length; i++) {
//            if (min >= tab[i]) {
//                min = tab[i];
//                indexMin = i;
//            }
//
//            if (max <= tab[i]) {
//                max = tab[i];
//                indexMax = i;
//            }
//        }
//        System.out.println("min: " + min + " pod indeksem: " + indexMin); // min 1 pod indeksem 3
//        System.out.println("max: " + max + " pod indeksem: " + indexMax); // max 8 pod indeksem 6
//------------------------------------------------------------------------------------------------------------------
//zad16.Find min/max value, list in the console indexes first finding min and max elements of arrays
//        int[] tab = {1, 2, 6, 1, 4, 3, 8};
//        int indexMin = 0;
//        int indexMax = 0;
//        int min = tab[0];
//        int max = tab[0];
//        for (int i = 0; i < tab.length; i++) {
//            if (min > tab[i]) {
//                indexMin = i;
//
//            }
//            if (max < tab[i]) {
//                max = tab[i];
//                indexMax = i;
//            }
//        }
//        System.out.println("min: " + min + " pod indeksem: " + indexMin); // min 1 pod indeksem 0
//        System.out.println("max: " + max + " pod indeksem: " + indexMax); // max 8 pod indeksem 6
//---------------------------------------------------------------------------------------------------------------------
//zad17.have a array tab, calculate the sum and average elements of arrays and list it on the console display
//        double sum = 0;
//        double avg = 0.0;
//        for (int i = 0; i < tab.length; i++)
//            sum += tab[i];
//        avg = sum / tab.length;
//        System.out.println("suma elementow tablicy: " + sum);
//        System.out.println("srednia:" + avg);
//----------------------------------------------------------------------------------------------------------------------
//zad18.Calculate average of elements even of array and list it onthe console display , score should eguals =5.0
//    double[] tab = {1, 2, 6, 1, 4, 3, 8};
//    double sum = 0;
//    double avg = 0.0;
//    for (int i = 0; i < tab.length; i++)
//      if (tab[i] % 2 == 0) {  // check the even condition i
//        sum += tab[i];      // list next even elements
//        avg = sum / tab.length;
//      }
//    System.out.println("average elements of arrays: " + avg);
//--------------------------------------------------------------------------------------------------------------------
//zad.19.Check if given number contains more then one not even digit. Get the number from user via console, print the result on the screen as 'Yes' or 'No'.
//    System.out.println("Give me the number:");
//    long givenNumber = new Scanner(System.in).nextInt(), tail;
//    boolean isNotEven = false;
//
//    while (givenNumber != 0) {
//      tail = givenNumber % 10;
//
//      if (isNotEven && tail % 2 != 0) {
//        System.out.println("yes");
//        return;
//      }
//      if (tail % 2 != 0)
//        isNotEven = true;
//
//      givenNumber = givenNumber / 10;
//    }
//    System.out.println("no");
//-------------------------------------------------------------------------------------------------------------------
//zad.20.Get from user some integer numbers (if the user will type 0 then stop). Calculate the avg and print it on the screen.
//    int number = 1;
//    double count = 0, sum = 0;
//    while (true) {
//      System.out.println("get number:");
//      number = new Scanner(System.in).nextInt();
//      if(number == 0)
//        break;
//      sum += number;
//      count++;
//    }
//    System.out.println("Avg = " + sum / count);
//--------------------------------------------------------------------------------------------------------------------------------
//zad.21. Get from user some integer numbers with its weights (if the user will type 0 number then stop).Calculate the weighted avg
//    int weight = 0, number = 0, numberCount = 0, sumOfNumbersForWeight = 0;
//    double nominator = 0, denominator = 0;
//    Scanner scanner = new Scanner(System.in);
//    while (true) {
//      System.out.println("Provide the weight: ");
//      weight = scanner.nextInt();
//      if (weight == -1)
//        break;
//      numberCount = 0;
//      sumOfNumbersForWeight = 0;
//      while (true) {
//        System.out.println("Provide the numbers for weight [" + weight + "]: ");
//        number = scanner.nextInt();
//        if (number != -1) {
//          sumOfNumbersForWeight += number;
//          numberCount++;
//        } else {
//          System.out.println("--Log: sumOfNumbersForWeight: " + sumOfNumbersForWeight);
//          System.out.println("--Log: sumOfNumbersForWeight * weight: " + sumOfNumbersForWeight * weight);
//          nominator += (sumOfNumbersForWeight * weight);
//          break;
//        }
//      }
//      System.out.println("--Log: numberCount * weight: " + numberCount * weight);
//      denominator += (numberCount * weight);
//      System.out.println("--Log: denominator: " + denominator);
//    }
//    System.out.println("--Log: nominator: " + nominator + " denominator: " + denominator);
//    System.out.println("Weighted avg is: " + (nominator / denominator));
//--------------------------------------------------------------------------------------------------------------------
//zad.22. Inputs: stawka godzinowa brutto (double), procent podatku (int), Output (wypisanie w konsoli): (1) łączny dochód roczny brutto/netto (2) dochód miesięczny brutto/nett
//    double taxPercentage;
//    double grossHourlyRate, yearlyProfit, monthlyProfit;
//
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("give level of gross hourly rate: ");
//    grossHourlyRate = scanner.nextInt();
//    System.out.println("give tax percentage: ");
//    taxPercentage = scanner.nextInt();
//
//    yearlyProfit = (grossHourlyRate*8)*21*12;
//    monthlyProfit = (grossHourlyRate*8)*21;
//    System.out.println("our yearly gross profit equals: " + yearlyProfit);
//    System.out.println("our yearly net profit - tax equals: " + (yearlyProfit - (yearlyProfit * (taxPercentage / 100))));
//    System.out.println("our monthly gross profit equals: " + monthlyProfit);
//    System.out.println("our monthly net profit - tax equals: " + (monthlyProfit - (monthlyProfit * (taxPercentage / 100))));
//---------------------------------------------------------------------------------------------------------------------------------
//zad.23. Jakie mam spalanie na 100 km Inputs: km przed / km po, ilosc zatankowanego paliwa
//    double afterMeterStatus, beforeMeterStatus,amountOfFuel;
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("fist check amount of kilometers :");
//    beforeMeterStatus = scanner.nextInt();
//    System.out.println("second check amount of kilometers :");
//    afterMeterStatus = scanner.nextInt();
//    System.out.println("check how many liters tanked:");
//    amountOfFuel = scanner.nextInt();
//
//    System.out.println((afterMeterStatus-beforeMeterStatus)+ "amount liters tanked:"+ amountOfFuel + "burned:" + amountOfFuel/(afterMeterStatus-beforeMeterStatus)*100);
//------------------------------------------------------------------------------------------------------------------------------
// conditions statement: if (jeśli  condition true),  else if ( ponadto ) , else ( jeżeli if another conditions is true )
//    if() {
//    } else if() {
//
//    } else {
//    }
//---------------------------------------------------------------------------------------------------------------
//    if () {
//    }
//    if () {
//
//    } else {
//    }
//---------------------------------------------------------------------------------------------------------------------
// Loop operations, how many messages there will be
//    for(int i = 0; i < 2; i++) {     // 2 messages
//      for(int j = 0; j < 2; j++) {   // 2 messages
//        System.out.println("wew");   // 2 messages
//      }
//      System.out.println("zew");
//    }
//-------------------------------------------------------------------------------------------------------------------
//    int count = 0;
//    for(int i = 0; i < 2; i++) {        //2 messages
//      for(int j = 0; j < 2; j++) {     // 2*2
//        for(int k = 0; k < 2; k++) {  // 2*2*2
//          count++;
//        }
//        count++;
//      }
//      count++;
//    }
//---------------------------------------------------------------------------------------------------------------------
//stop this loop when the j equals 1, you will use break statement
//    for(int i = 0; i < 2; i++) {
//      if(i==1)
//        break;
//      // sout
//    }
//--------------------------------------------------------------------------------------------------------------------
//stop this program when j==1
//    for(int i = 0; i < 3; i++) {
//      if(i==1)
//        continue;
//      System.out.println(i);
//    }
//    boolean count = false;
//    for (int i = 0; i < 2; i++) {
//      for (int j = 0; j < 2; j++) {
//        if (j == 1) {
//          count = true;
//          break;
//        }
//        System.out.println("wew");
//      }
//      if (count)
//        break;
//      System.out.println("zew");
//    }
//--------------------------------------------------------------------------------------------------------------------
//25.Write appropriate code to this picture
// * * *
// * * *
// * * *
//    for (int i = 0; i < 3; i++) {
//      for (int j = 0; j < 3; j++) {
//        System.out.print("* ");
//      }
//      System.out.println();
//    }
//-------------------------------------------------------------------------------------------------------------------
// 26.Write appropriate code to this picture
//    int j = 5;
//    for (int i = 1; i <= 9; i++) {
//        System.out.print("*" + " ");
//        if(i == j) {
//          System.out.println();
//          j += 3;
//        }
//    }
//    System.out.println();
//------------------------------------------------------------------------------------------------------------------
// 27.Write appropriate code to this picture
//    for (int i = 0; i < 5; i++) {
//      for (int j = 0; j < 5; j++) {
//        if (i == 1 && j == 1)
//          System.out.print("  ");
//        else
//          System.out.print("* ");
//      }
//      System.out.println();
//    }

// 28.program can adapt to the size of matrixes
//    int columns = 5, rows = 5;
//    for (int i = 0; i < rows; i++) {
//      for (int j = 0; j < columns; j++) {
//        if (i == 0 || j == 0
//                || j == (columns - 1) || i == (rows - 1))
//          System.out.print(" * " );
//        else
//          System.out.print("  ");
//      }
//      System.out.println();
//    }

//29.change the display picture with square to rectangle
    int columns = 5, rows = 5;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (i == 0 || j == 0 || j == (columns - 1) || i == (rows - 1))
          System.out.print(  " * ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }

  }
}


