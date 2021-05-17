package com.reite.main.container;

import java.util.*;

public class MainHS {
  public static void main(String[] args) {
    int counter = 0, counterBumper = 0, counterGlass = 0, counterMirror = 0, counterWiper = 0;
    List<Object> parts = new LinkedList<>();
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

  private static int addBumper(List<Object> parts, Scanner scanner, Integer index, Integer swapIndex) {
    System.out.print("Podaj nazwe: ");
    String bumperName = scanner.nextLine();
    System.out.print("Przednia [true/false]? ");
    boolean bumperIsFront = scanner.nextBoolean();
    Bumper bumper = new Bumper(bumperName, bumperIsFront);
    if (swapIndex != null) {
      Object toSwap = parts.get(swapIndex);
      parts.add(index, toSwap);
      parts.add(swapIndex, bumper);
      return swapIndex;
    }
    if (index != null) parts.add(bumper);
    else parts.add(index, bumper);
    return parts.indexOf(bumper);
  }

  private static int addGlass(List<Object> parts, Scanner scanner, Integer index, Integer swapIndex) {
    System.out.print("Podaj nazwe: ");
    String glassName = scanner.nextLine();
    System.out.print("Podaj cene: ");
    double glassCost = scanner.nextDouble();
    Glass glass = new Glass(glassName, glassCost);
    if (swapIndex != null) {
      Object toSwap = parts.get(swapIndex);
      parts.add(index, toSwap);
      parts.add(swapIndex, glass);
      return swapIndex;
    }
    if (index != null) parts.add(glass);
    else parts.add(index, glass);
    return parts.indexOf(glass);
  }

  private static int addMirror(List<Object> parts, Scanner scanner, Integer index, Integer swapIndex) {
    System.out.print("Podaj nazwe: ");
    String mirrorName = scanner.nextLine();
    System.out.print("Prawe [true/false]? ");
    boolean mirrorIsRight = scanner.nextBoolean();
    Mirror mirror = new Mirror(mirrorName, mirrorIsRight);
    if (swapIndex != null) {
      Object toSwap = parts.get(swapIndex);
      parts.add(index, toSwap);
      parts.add(swapIndex, mirror);
      return swapIndex;
    }
    if (index != null) parts.add(mirror);
    else parts.add(index, mirror);
    return parts.indexOf(mirror);
  }

  private static int addWiper(List<Object> parts, Scanner scanner, Integer index, Integer swapIndex) {
    System.out.print("Podaj nazwe: ");
    String wiperName = scanner.nextLine();
    System.out.print("Przedni [true/false]? ");
    boolean wiperIsFront = scanner.nextBoolean();
    Wiper wiper = new Wiper(wiperName, wiperIsFront);
    if (swapIndex != null) {
      Object toSwap = parts.get(swapIndex);
      parts.add(index, toSwap);
      parts.add(swapIndex, wiper);
      return swapIndex;
    }
    if (index != null) parts.add(wiper);
    else parts.add(index, wiper);
    return parts.indexOf(wiper);
  }
}
