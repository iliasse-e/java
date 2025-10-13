package fr.collection;

import java.util.ArrayList;

public class ArrayListEx {
  public static void main(String[] args) {
    
    ArrayList arrList = new ArrayList<String>();

    arrList.add("blue");
    arrList.add( "yellow");
    arrList.add( "pink");
    arrList.add("whatever man");

    arrList.get(1);
    arrList.set(0, "white");
    arrList.remove(0);
    
    // On ajoute les données d'une arrayList dans une autre
    ArrayList arrList2 = new ArrayList<String>();
    arrList2.addAll(arrList);

  }
  
}