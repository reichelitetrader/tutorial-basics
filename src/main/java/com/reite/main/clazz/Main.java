package com.reite.main.clazz;

import java.awt.*;

public class Main {
  public static void main(String[] args) {
// int a = 1; // creating variable type of int
// Integer b = new Integer(1); // creating object type of Integer
// HelloWorld helloWorld = new HelloWorld(); // creating object (variable) type HelloWorld;
// helloWorld.sth = 4; // set property of values
// a = helloWorld.doSth(5) + 1; // calling the method
// System.out.println(a); // ???
//---------------------------------------------------------------------------------------------
// Dog rex = new Dog("Rex");
// Dog fafik = new Dog();
// Dog teddy = new Dog();
// rex.setColour("Czarny");
// fafik.setName("Fafik");
// fafik.setColour("Nijaki");
// fafik.setAge(2);
// teddy.setColour("Rudy");
// teddy.setName("Teddy");
// teddy.setAge(10);
// System.out.println(rex.data()); // [Rex, Czarny, 2020]
// System.out.println(fafik.data()); // [Fafik, Nijaki, 2018]
// System.out.println(teddy.data()); // [Teddy, Rudy, 2010]
// Dog insane = new Dog();
// System.out.println(insane.data()); // [,, 2020]
//--------------------------------------------------------------------------------------------
// Magic m = new Magic(); // Utworzono magię!
// m.setMagic(20);
// m.doMagic(2); // Abra kanabra 20! Abra kanabra 20!
// Magic mm = new Magic(m); // Utworzono magię z magii!
// mm.doMagic(1); // Abra kanabra 20!
// Magic mmm = new Magic(); // Utworzono magię!
// mmm.doMagic(3); // Abra kanabra 0! Abra kanabra 0! Abra kanabara 0!
// Magic mmmm = new Magic(); // Utworzono magię!
// mmmm.copyMagic(mmm); // Skopiowano magię!
// mmmm.doMagic(2); // Abra kanabra 0! Abra kanabra 0!
//-------------------------------------------------------------------------------------------
// Cat catMruczek = new Cat("Mruczek"); // New cat Mruczek born!
// Cat catBurczek = new Cat("Burczek"); // New cat Burczek born!
// catMruczek.breathing(2); // breath, breath...
// catMruczek.breathing(1); // breath...
// catMruczek.breathing(1); // breath...
// catBurczek.breathing(1); // breath...
// catMruczek.breathing(3); // breath, breath, breath...
// catBurczek.breathing(null); // dead
// System.out.println(catMruczek.getStatus()); // breaths: 7
// System.out.println("Burczek " + catBurczek.getStatus() + " :("); // Burczek death :(
// catBurczek.breathing(1); // breath...
// System.out.println("Burczek uratowany!!! " + catBurczek.getStatus()); // Burczek uratowany!!! breaths: 1
// catMruczek.breathing(null); // dead
// catMruczek.breathing(3); // breath, breath, breath...
// System.out.println(catMruczek.getStatus()); // breaths: 3
//-------------------------------------------------------------------------------------------
// StringUtils s = new StringUtils("USD");
// System.out.println(s.countA("Ala")); // 2
// System.out.println(s.reverse("Koala")); // alaoK
// System.out.println(s.countNotA("Koala")); // 2
// System.out.println(s.getMiddle("Koala")); // 2
// System.out.println(s.getMiddle("Topola")); // 2
// System.out.println(s.getMiddle("Krawiec")); // 3
// System.out.println(s.getMiddle("Karambol")); // 3
//-------------------------------------------------------------------------------------------
//QCalculator qc = new QCalculator();
//qc.calculate(1, 2, -3); // x_1 = -3, x_2 = 1
//------------------------------------------------------------------------------------------
    SeriesFibonacci sf = new SeriesFibonacci();
//sf.sumSeriesFibonacci(5);
    System.out.println(sf.checkNumber(1));
    if(1 > 0)
      System.out.println("Tak");
    else
      System.out.println("Nie");
    //1 > 0 ? System.out.println("Tak") : System.out.println("Nie"); // ŹLE!!!
    String result = 1 > 0 ? "Tak" : "Nie"; // DOBRZE!!!
//------------------------------------------------------------------------------------------
    // Utwórz klasę o nazwie Ferniture o nastupujęcych właściwościach:
    // - String name;
    // - double x;
    // - double y;
    // - double z.
    // Dodatkowo, wyposaż klasę w metody:
    // - capacity - zwracającą pojemność danego mebla;
    // - getter'y i setter'y.
    Furniture furniture = new Furniture("Komoda", 100, 100, 100);
    System.out.println(furniture.capacity());

    // Dodaj w klasie Furniture odpowiedni konstruktor przy pomocy którego
    // będzie można ustawić wartości właść. name, x, y, z.
  }
}

