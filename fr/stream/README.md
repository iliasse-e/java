# Streams

Introduite en Java 8, cette API a pour but de mettre en place la programmation fonctionnelle.
Un flux est une représentation séquentielle sur laquelle il est permis d'appliquer des opérations.
Cette API a deux principales intérêts :

1. Permet d'effectuer des opérations sans structure de boucle.
Et donc de réaliser des traitements complexes sans perdre en lisibilitée.

2. Les streams sont réalisées en flux, ce qui limite l'empreinte dans la mémoire.

## Création d'un Stream

Type générique :

```java
Stream<String> stream;
```

On peut créer un stream à partir d'un builder fourni par la classe `Stream` :

```java
Stream<String> stream = Stream.<String>builder().add("Ahlan").add("wa").add("sahlan").build();
```

Il existe des interfaces de Stream pour certains types primitifs :
`IntStream`, `LongStream`, `DoubleStream`.

```java
IntStream intStream = IntStream.of(1, 20, 30, 579);
```

On peut créer un stream à partir d'une Array grâce au méthodes d'Array comme `Arrays.stream ` :

```java
int[] tableau = { 1, 2, 3, 4 };
IntStream stream = Arrays.stream(tableau);
```

Les collections peuvent aussi être converties en stream via la méthode de l'interface ``Collection`` :

```java
List<String> liste = new ArrayList<>().add("Hello").add("World");

Stream<String> stream = liste.stream();
```

Un fichier peut être parcours par un stream (grâce à la méthode `File.lines()`) :

```java
Path fichier = Paths.get("fichier.txt");
Stream<String> linesStream = Files.lines(fichier);
```

## La réduction

Elle consiste a obtenir un résultat unique à partir d'un stream.

Si le stream est composé de nombres, on peut réaliser une réduction mathématique en calculant la somme, ou une autre opération mathématique :

```java
int total = IntStream.range(0, 50).sum(); // on peut utiliser .average()
```

### Optional

Les streams intoduisent la notion de *Optional*.
Il se peut qu'une réduction n'aboutit pas à un résultat. Calculer la moyenne sur un stream vide peut poser des problèmes.

La méthode `.average()` prévoit le coup en retournant un type `OptionalDouble` :

```java
OptionalDouble average = IntStream.of(20, 10).average();

if (average.isPresent()) {
  // exe.
}
```

Cette object contient des méthodes `.isPresent()`, `.isEmpty()`, ... qui peuvent s'avérer utile.


Pour tout autre chose, on peut aussi utiliser `.reduce()` :

```java
OptionalInt doubleHighestInt = IntStream.of(20, 10).reduce((n1, n2) -> Math.max(n1, n2) * 2);
```

## La collecte

Consiste à créer une collection à partir d’un stream.
On a à disposition la méthode `.collect()`, qui est la méthode terminale d'un stream permettant de rassembler les éléments traités en structure de donnée.

```java
List<String> autreListe = liste.stream().collect(Collectors.toList());
```

> **Collectors** : Cette classe utilitaire permet de fournir des méthodes de récupération.
Comme s'il on informe la méthode `.collect()` de la structure de donnée que l'on souhaite.
```java
Collectors.toList()         // Collecte dans une List
Collectors.toSet()          // Collecte dans un Set
Collectors.toMap()          // Collecte dans une Map
Collectors.joining(", ")    // Concatène les éléments en String
Collectors.groupingBy()     // Regroupe par clé
Collectors.partitioningBy() // Partitionne selon un prédicat
Collectors.summarizingInt() // Statistiques sur des entiers
```

*Collectors permet aussi de réduire le stream a une valeur unique :*

```java
List<String> list = Arrays.asList("un", "deux", "trois", "quatre", "cinq");
String resultat = list.stream().collect(Collectors.joining(", "));
```

## Filtrage

C'est une opération sur un flux qui consiste à filtrer/éléminer des éléments.
Méthode `.filter()`.

```java
// on construit la liste des voitures qui ne sont pas de marque "citroen"
List<Voiture> sansCitroen = liste.stream()
                                 .filter(v -> !v.getMarque().equals("citroen"))
                                 .collect(Collectors.toList());
```

## Mapping

`.map()`

```java
// mapping du stream de voiture en stream de String
Set<String> marques = liste.stream()
                           .map(Voiture::getMarque)
                           .collect(Collectors.toSet());
```

Pour réaliser un mapping vers un type primitif, il faut utiliser les méthodes `Stream.mapToInt`, `Stream.mapToLong` ou `Stream.mapToDouble`.
On peut aussi convertir un stream contenant un type primitif vers un autre stream contenant un type primitif.

```java
// Affichage de la racine carré des 100 premiers entiers
IntStream.range(1, 101)
         .mapToDouble(Math::sqrt)
         .forEach(System.out::println);
```

## Pour aller plus loin : Le parallélisme

Permet de profiter de processeurs multi-cœurs et des machines multi-processeurs.
