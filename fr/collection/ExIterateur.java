package fr.collection;

import java.util.Iterator;

public class ExIterateur {

  private static final int SIZE = 15;
  private int[] tab = new int[SIZE];

  public ExIterateur() {
    for (int i = 0; i < SIZE; i++) {
      tab[i] = i;
    }
  }

  public void afficher() {
    Iterator<Integer> it = new EvennementIterateur();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

  // Classe interne qui accède directement à tab
  private class EvennementIterateur implements Iterator<Integer> {
    private int indice = 0;

    @Override
    public boolean hasNext() {
      return indice < tab.length;
    }

    @Override
    public Integer next() {
      int valeur = tab[indice];
      indice += 2; // On saute un élément sur deux (événements)
      return valeur;
    }
  }

  public static void main(String[] args) {
    new ExIterateur().afficher();
  }
}
