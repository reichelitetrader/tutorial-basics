package com.reite.main.test;

public class Main {
  public static void main(String[] args) {
    Test test = new Test(1, 2.0, (short) 1, 1);
    double[] tab = new double[1];
    Test test1 = new Test(tab, new int[]{1, 2}, new short[1], new long[1]);
    char a = 'R';
    test.a = 'R';  //PRZYPISANIE USTAWIANIE WARTOSCI POLA ,
    test.zeroSettings();
    //konstruktor(metoda do inicjowanie pól, wywołanie metod, tworzenie obiektów )

    // utworzenie obiektu Test korzystajac z konstruktora ust. pola typu zlozonego
    // dodanie nowego konstr. ktory ustawi wszystkie pola, wszystkich typow, ma on wykorzystywac jeden z wczesniej zdefiniowanych konstruktorow (podpowiedz this)
    // dodanie metody ktora 'zeruje' - ustawia jakimis 'zerowymi' wartosciami wszystkie pola klasy np. nowa pusta tablica, 0, '' etc.
  }



}
