package com.reite.main.container;

import java.util.*;

public class MainLL {
  public static void main(String[] args) {
    int counter = 0, counterBumper = 0, counterGlass = 0, counterMirror = 0, counterWiper = 0;
    Set<Object> parts = new HashSet<>();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Podaj typ elementu: ");
      String type = scanner.nextLine();
      switch (type.toLowerCase()) {
        case "zderzak":
          if (counterBumper <= 3) {
            System.out.print("Podaj pozycje na ktora chcesz dodac element: ");
            int index = scanner.nextInt();
            System.out.print("Podaj pozycje elementu do zamiany: ");
            int swapIndex = scanner.nextInt();
            if (index == swapIndex) {
              System.err.println("Podane indeksy sa rowne");
              break;
            }
            addBumper(parts, scanner, index != -1 ? index : null, swapIndex != -1 ? swapIndex : null);
            counterBumper++;
          }
          break;
        case "szyba":
          if (counterMirror <= 3) {
            System.out.print("Podaj pozycje na ktora chcesz dodac element: ");
            int index = scanner.nextInt();
            System.out.print("Podaj pozycje elementu do zamiany: ");
            int swapIndex = scanner.nextInt();
            if (index == swapIndex) {
              System.err.println("Podane indeksy sa rowne");
              break;
            }
            addGlass(parts, scanner, index != -1 ? index : null, swapIndex != -1 ? swapIndex : null);
            counterMirror++;
          }
          break;
        case "lusterko":
          if (counterGlass <= 3) {
            System.out.print("Podaj pozycje na ktora chcesz dodac element: ");
            int index = scanner.nextInt();
            System.out.print("Podaj pozycje elementu do zamiany: ");
            int swapIndex = scanner.nextInt();
            if (index == swapIndex) {
              System.err.println("Podane indeksy sa rowne");
              break;
            }
            addMirror(parts, scanner, index != -1 ? index : null, swapIndex != -1 ? swapIndex : null);
            counterGlass++;
          }
          break;
        case "wycieraczka":
          if (counterWiper <= 3) {
            System.out.print("Podaj pozycje na ktora chcesz dodac element: ");
            int index = scanner.nextInt();
            System.out.print("Podaj pozycje elementu do zamiany: ");
            int swapIndex = scanner.nextInt();
            if (index == swapIndex) {
              System.err.println("Podane indeksy sa rowne");
              break;
            }
            addWiper(parts, scanner, index != -1 ? index : null, swapIndex != -1 ? swapIndex : null);
            counterWiper++;
          }
          break;
        default:
          System.err.println("Brak tego typu czesci!");
          break;
      }
      System.out.println("Dodano " + (counter + 1) + " elementow");
      counter++;
      if (counter == 15)
        break;
    }
  }

  private static int addBumper(Set<Object> parts, Scanner scanner, Integer index, Integer swapIndex) {
    System.out.print("Podaj nazwe: ");
    String bumperName = scanner.nextLine();
    System.out.print("Przednia [true/false]? ");
    boolean bumperIsFront = scanner.nextBoolean();
    Bumper bumper = new Bumper(bumperName, bumperIsFront);
    List tmp = new ArrayList(parts);
    if (swapIndex != null) {
      Object toSwap = get(parts, swapIndex);
      tmp.add(index, toSwap);
      tmp.add(swapIndex, bumper);
      parts = new HashSet<>(tmp);
      return swapIndex;
    }
    if (index != null) tmp.add(bumper);
    else tmp.add(index, bumper);
    parts = new HashSet<>(tmp);
    return tmp.indexOf(bumper);
  }

  private static int addGlass(Set<Object> parts, Scanner scanner, Integer index, Integer swapIndex) {
    System.out.print("Podaj nazwe: ");
    String glassName = scanner.nextLine();
    System.out.print("Podaj cene: ");
    double glassCost = scanner.nextDouble();
    Glass glass = new Glass(glassName, glassCost);
    List tmp = new ArrayList(parts);
    if (swapIndex != null) {
      Object toSwap = get(parts, swapIndex);
      tmp.add(index, toSwap);
      tmp.add(swapIndex, glass);
      parts = new HashSet<>(tmp);
      return swapIndex;
    }
    if (index != null) tmp.add(glass);
    else tmp.add(index, glass);
    parts = new HashSet<>(tmp);
    return tmp.indexOf(glass);
  }

  private static int addMirror(Set<Object> parts, Scanner scanner, Integer index, Integer swapIndex) {
    System.out.print("Podaj nazwe: ");
    String mirrorName = scanner.nextLine();
    System.out.print("Prawe [true/false]? ");
    boolean mirrorIsRight = scanner.nextBoolean();
    Mirror mirror = new Mirror(mirrorName, mirrorIsRight);
    List tmp = new ArrayList(parts);
    if (swapIndex != null) {
      Object toSwap = get(parts, swapIndex);
      tmp.add(index, toSwap);
      tmp.add(swapIndex, mirror);
      parts = new HashSet<>(tmp);
      return swapIndex;
    }
    if (index != null) tmp.add(mirror);
    else tmp.add(index, mirror);
    parts = new HashSet<>(tmp);
    return tmp.indexOf(mirror);
  }

  private static int addWiper(Set<Object> parts, Scanner scanner, Integer index, Integer swapIndex) {
    System.out.print("Podaj nazwe: ");
    String wiperName = scanner.nextLine();
    System.out.print("Przedni [true/false]? ");
    boolean wiperIsFront = scanner.nextBoolean();
    Wiper wiper = new Wiper(wiperName, wiperIsFront);
    List tmp = new ArrayList(parts);
    if (swapIndex != null) {
      Object toSwap = get(parts, swapIndex);
      tmp.add(index, toSwap);
      tmp.add(swapIndex, wiper);
      parts = new HashSet<>(tmp);
      return swapIndex;
    }
    if (index != null) tmp.add(wiper);
    else tmp.add(index, wiper);
    parts = new HashSet<>(tmp);
    return tmp.indexOf(wiper);
  }

  private static Object get(Set<Object> parts, Integer index) {
    int i = 0;
    for (Object obj : parts)
      if (i == index)
        return obj;
    i++;
    return null;
  }
}
