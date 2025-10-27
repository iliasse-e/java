package fr.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterEx {

  public static void main(String[] args) {

    List<Voiture> voitures = Arrays.asList(
      new Voiture("citroën"), 
      new Voiture("renault"),
      new Voiture("Toyota")
    );
    
    // On filtre par marques
    List<Voiture> voituresJaponaises = voitures
            .stream()
            .filter(voiture -> voiture.getPays().equals("Japon"))
            .collect(Collectors.toList());

    System.out.println(voituresJaponaises.size());

    // On map pour récupérer les marques
    Set<String> marques = voitures
            .stream()
            .map(voiture -> voiture.getMarque()) 
            // On va préférer .map(Voiture::getMarque)
            .collect(Collectors.toSet());
  }
  
}
