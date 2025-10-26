# I/O

![diagramme java IO](../../assets/java%20io.jpeg)

# File et chemins

Le package java.io fournit la classe File qui représente un fichier. À travers, cette classe, il est possible de savoir si le fichier existe, s’il s’agit d’un répertoire… On peut également créer le fichier ou le supprimer, changer ses droits (lire, écrire, executer).

Ce package représenté par des objets de type ``java.io.InputStream`` ``java.io.Reader``, ``java.io.OutputStream`` et ``java.io.Writer``.

Un flux se déroule dans la logique suivante :

1. Ouverture fu flux (d'un émeteur vers un récepteur)
2. Lecture ou écriture
3. fermeture du flux

## InputStream et ses implémentations

Cette classe abstraite représente les flux d'entrée de données en binaire que l'on va pouvoir manipuler.
Elle déclare les méthodes `.read()`. Ces méthodes retournent le nombre de caractères lus ou -1 pour signaler la fin du flux.

Elle dispose de plusieurs implémentations comme `ByteArrayInputStream` qui permet d'ouvrir un flux sur un tableau de **byte**.

```java
byte[] tableau = "Bonjour la famille".getBytes(); // on créé le tableau de byte nécéssaire pour déclarer le ByteArrayInputStream
ByteArrayInputStream inputStream = new ByteArrayInputStream(tableau);

int octet;
while ((octet = inputStream.read()) != -1) {
  System.out.println((char) octet);
}
```

L'implémentation `FileInputStream` permet d’ouvrir un flux de lecture binaire sur un **fichier**.

[Exemple de l'implémentation](./FileInputStreamEx.java)

### IOException et FileNotFoundException

`IOException` dans le cas ou un problème à l'éxecution des méthodes `.read` ou `.write`.

`FileNotFoundException` dans le cas ou le fichier n'a pas été trouvé (hérite de `IOException`).

## OutputStream et ses implémentations

`ByteArrayOutputStream` traite les flux de byte, et `FileOutputStream` de fichier.

```java
ByteArrayOutputStream stream = new ByteArrayOutputStream();

for(byte b: "Bonjour la famille".getBytes()) {
  stream.write(b);
}
```

[Exemple de l'implémentation](./CopyFile.java)

## FilterInputStream et FilterOutputStream

```java

```

### Implémentations DataInput/OutputStream

Offre la possibilité de lire des variables de type primitif grâce aux méthodes : `.readDouble()`, `.readInt()`, ...

```java
// Déclaration hiérarchique
DataInputStream = dis = new DataInputStream(
  new BuffuredInputStream(
    new FileInputStream(
      new File("file.txt")
    )
  )
);
```

### Implémentations BuffuredInput/OutputStream

Met à disposition une zone tampon dont il est possible d’indiquer la taille à la construction de l’objet. Ces classes sont très utiles lorsque l’on veut lire ou écrire des données sur un disque ou sur un réseau afin de limiter les accès système et améliorer les performances.

```java

```

## Stream orienté caractères

Le package java.io contient un ensemble de classes qui permettent de manipuler des flux caractères et donc du texte.


### Reader et classes concrètes

La classe ``Reader`` est une classe abstraite qui permet de lire des flux de caractères. Comme InputStream, la classe ``Reader`` fournit des méthodes read mais qui acceptent en paramètre des caractères.

`StringReader` est une implémentation

```java
Reader reader = new StringReader("hello the world");

int caractere;
while ((caractere = reader.read()) != -1) {
  System.out.print((char) caractere);
}
```

Il existe `FileReader` pour lire les fichier. Il ressemble à `FileInputStream`, à la différence que l'on accède aux **char** au lieu de **byte**.

### Writer et classes concrètes

La classe ``Writer`` est une classe abstraite qui permet d'écrire des flux de caractères. Comme OutputStream, la classe ``Writer`` fournit des méthodes write mais qui acceptent en paramètre des caractères.
Elle fournit également des méthodes append qui réalisent la même type d’opérations et qui retournent l’instance du Writer afin de pouvoir chaîner les appels.


```java
Writer writer = new StringWriter();

for (char c: "Bonjour ") {
  writer.append(c);
}

writer.append("les")
      .append(' ')
      .append("amis");

String resultat = writer.toString();
```

La classe `FileWriter` permet d’écrire un flux de caractères dans un fichier.

## 

```java

```