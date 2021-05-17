package com.reite.main.clazz;

public class StringUtils {
  public StringUtils(String usd) {
  }
  //1.W klasie napisz metodę: countA, zwracającą int - ilość liter a w przekazanym w parametrze łańcuchu znaków (String)
  public int countA(String text) {
    int count = 0;
    for (int i = 0; i < text.length(); i++)
      if (text.charAt(i) == 'a' || text.charAt(i) == 'A')
        count += 1;
    return count;
  }
  //2.metodę reverse, zwracającą String - dany łańcuch znaków zapisany od tyłu.
  public String reverse(String text) {
    String reverse = "";
    for (int i = text.length() - 1; i >= 0; i--)
      reverse += text.charAt(i);
    return reverse;
  }
  //3.Metodę countNotA, zwracającą int - ilość liter różnych od a/A w parametrze łańcuchu znaków (String).
  public int countNotA(String text) {
    int count = 0;
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) != 'a' || text.charAt(i) != 'A') {
        count++; // zle
      }
    }
    return count;
  }
  //4.Metodę getMiddle, zwracającą int - indeks środkowego elementu z przekazanego w parametrze łańcuchu znaków (String).
  public int getMiddle(String text) {
    return (text.length() - 1) / 2;
  }
}


