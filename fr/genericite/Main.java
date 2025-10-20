package fr.genericite;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Paire<String, Integer> paire = new Paire<String,Integer>("Bonjour", 22);

    paire.setValeurDroite(123);

    paire.setValeurGauche("Buongiorno");

  }

  List<? super Object> arrayList = new ArrayList<>();

  Main() {
    arrayList.add(1);
  
    arrayList.add(2);
  
    arrayList.add(null);
  }


  Object getData() {
    return arrayList.get(0);
  }
  
}
