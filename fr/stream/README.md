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
```java

```
```java

```