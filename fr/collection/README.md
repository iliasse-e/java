# Les interfaces et les collections

(Cours sur les interfaces et les collections)[https://www.youtube.com/watch?v=kUC1YjalIr4&list=PLVJMczZGrFqm9aEe7sqkYTo-eeGcRahSj&index=8]

![Interfaces Collection](C:\Users\elabo\Documents\Dev\Java\java\assets\collection_uml_diagram.png)


## Interface Comparable

Méthode à implémenter : `compareTo()`

#### La class Employe

Exercice est d'implémenter l'interface ``Comparable``

#### La classe Entreprise

Exercice est d'utiliser la méthode ``.sort()`` de la classe utilitaire ``Arrays`` permettant de manipuler le tableau, et d'intéragir avec la méthode `compareTo()` de la classe ``Employe``.

## Interface Iterator

Définitir les méthodes : ``hasNext()``, ``next()`` et ``remove()``.

Représenté par les classes `ExIterator` & `EvennementIterateur` (dont cette derière est imbriquée).

## Iterator et ListIterator

Un autre exemple dans la classe `Iterateur`.

## Interface List

Hérite de l'interface `Collection`.

- Extensibles à volonté - sans limite de taille.
- Implémentations : `LinkedList`, `ArrayList`, `Vector` & `Stack`.

## Interface Set

Hérite de l'interface `Collection`.

## Interface Map

- Couple de clé - valeur.
- Implémentations : `HashMap`, `Hashtable`, `TreeMap` & `WeakHashMap`.

- La clé sert à récupérer une valeur (grâce à la méthode `.get()`).
