## Class générique

```java
List arrayList = new ArrayList();

arrayList.add("Bonjour");
arrayList.add(2);
arrayList.add(null);

// On doit caster la valeur de retour pour compiler
String s1 = (String) arrayList.get(0);

// On a plus aucun controle sur les données que l'on ajoute
arrayList.add(new Object());
```

La solution est la notion suivante :

```java
List<String> list = new ArrayList<>();

// On a plus à caster pour récuperer
String s1 = arrayList.get(0);

// On a le controle sur les données que l'on ajoute
arrayList.add(new Object()); // ERREUR du compilateur
```

```java
public class PaireChild<T, U> extends Paire<T, U> {

  public PaireChild(T valeurGauche, U valeurDroite) {
    super(valeurGauche, valeurDroite);
  }
  
}
```

```java
public class PaireChild2<T, U> extends Paire<String, Integer> {

  public PaireChild2(String valeurGauche, Integer valeurDroite) {
    super(valeurGauche, valeurDroite);
  }
  
}
```

## Méthode générique 
```java
public <T> boolean compare(T a, T b)
```