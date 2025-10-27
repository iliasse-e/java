# Polymorphisme, héritage & interface

Ce package représente ces trois thématiques. Les classes sont commentées.
Le package fr.fruit inclus aussi le polymorphisme.

# Classe et héritage

## Classe abstraite

Ne peut être instanciée, elle est hérité par une classe dérivée.

*Si elle implémente une interface, alors pas necessaire de définir les méthodes, qui se fera dans les classes dérivées*

## Méthode abstraite

Ne peut être déclarée que dans une classe abstraite, et définie dans chaque classé dérivée.

## final (attribut)

Constante, ne peut être affecté qu'une seule fois.
Représente un intérêt en sécurité et  performance/mémoire (moins de place, rapide à la récup).


## final (méthode)

Ne peut être redéfinie par les classes qui hérite de la classe.

## Surcharge de méthode

Redéfinition (on change donc son comportement) d'une méthode dans une classé dérivée.

# Polymorphisme

voir package fr.fruit

### @Override

Cela permet au compilateur de vérifier que la signature de la méthode correspond bien à une méthode d’une classe parente.

# Interfaces

Une interface introduit une abstraction pure qui permet un découplage maximal entre un service et son implémentation.

## La ségrégation d’interface

En programmation objet, le principe de ségrégation d’interface stipule qu’un client ne devrait pas avoir accès à plus de méthodes d’un objet que ce dont il a vraiment besoin. L’objectif est de limiter au strict minimum les interactions possibles entre un objet et ces clients afin d’assurer un couplage minimal et faciliter ainsi les évolutions et le refactoring. En Java, le principe de ségrégation d’interface a deux conséquences :

  1. Le type des variables, paramètres et attributs doit être choisi judicieusement pour restreindre au type minimum nécessaire par le code.

  2.  Une interface ne doit pas déclarer trop de méthodes.
