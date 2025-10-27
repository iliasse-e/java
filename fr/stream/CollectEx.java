package fr.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx {
  
public static void main(String[] args) {

  List<Voiture> liste = Arrays.asList(
    new Voiture("citroen"),
    new Voiture("renault"),
    new Voiture("audi"),
    new Voiture("citroen")
  );

  Map<String, List<Voiture>> map = liste.stream().collect(Collectors.groupingBy(Voiture::getMarque));
  Collection c = liste.stream().collect(Collectors.)

  System.out.println(map.get("citroen").size()); // 2
  System.out.println(map.get("renault").size()); // 1
  System.out.println(map.get("audi").size());    // 1
}


}
