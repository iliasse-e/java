package fr.entreprise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterateur {
  public static void main(String[] args) {
    ArrayList al = new ArrayList<>();

    for (int i = 0; i < 9; i++) {
      al.add(i);
    }

    // Récupère l'object Iterator que fournit l'interface Collection (dont hérite ArrayList)
    Iterator it = al.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }

    // Récupère l'object ListIterator que fournit l'interface Collection (dont hérite ArrayList)
    ListIterator listIt = al.listIterator();

    // On itère en avançant
    while (listIt.hasNext()) {
      System.out.println(listIt.next());
    }

    // On itère à l'envers
    while (listIt.hasPrevious()) {
      System.out.println(listIt.previous());
    }
  }
}
