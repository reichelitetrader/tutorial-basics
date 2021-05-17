package com.reite.main.flow;
import java.util.Arrays;
//algorithm bubble sort, the loop will run across the array index from 0 to 4
public class Main {
  public static void main(String[] args) {
    int[] numbers = {5, 4 , 3 , 2 , 1}; // fill the array with numbers to be sorted, will check array index
    System.out.println(Arrays.toString(sort(numbers))); // use method tostring and give name of the method with parameter of character array
  }

  private static int[] sort(int[] numbers) {   //method called sort return sorted array with one argument/parameter
    boolean changed = false;
    for (int index = 0; index < numbers.length - 1; index++) {  //loop start from index 0 finis to numbers.length -1
      int currentNumber = numbers[index];  //must know what number next to index
      int nextNumber = numbers[index + 1];  // must know number next to index+1
      if(currentNumber > nextNumber) {  //compare current number is bigger than next number
        numbers[index] = nextNumber;  // change places
        numbers[index +1] = currentNumber;
        changed = true;  //  // signal the change status
      }
    }
    return changed ? sort(numbers) : numbers;   //if sth changed still sort array, if not will return numbers array,
    // shorter if ( condition ? if true : if false )
  }
}
