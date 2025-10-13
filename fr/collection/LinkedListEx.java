package fr.collection;

import java.util.LinkedList;

public class LinkedListEx {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList<Integer>();

    for (int i = 0; i < 9; i++) {
      linkedList.add(i);
    }

    // On ajoute au début de la liste (existe aussi removeFirst)
    linkedList.addFirst(34);

    // Et à la fin de la liste (existe aussi removeLast)
    linkedList.addLast(1);
  }
  
}
