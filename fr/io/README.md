# I/O

# File et chemins

Le package java.io fournit la classe File qui représente un fichier. À travers, cette classe, il est possible de savoir si le fichier existe, s’il s’agit d’un répertoire… On peut également créer le fichier ou le supprimer, changer ses droits (lire, écrire, executer).

Ce package représenté par des objets de type ``java.io.InputStream`` ``java.io.Reader``, ``java.io.OutputStream`` et ``java.io.Writer``.

Un flux se déroule dans la logique suivante :

1- Ouverture fu flux (d'un émeteur vers un récepteur)
2- Lecture ou écriture
3- fermeture du flux

## InputStream et ses implémentations

Cette classe abstraite représente les flux d'entrée de données en binaire que l'on va pouvoir manipuler.
Elle déclare les méthodes `.read()`. Ces méthodes retournent le nombre de caractères lus ou -1 pour signaler la fin du flux.

Elle dispose de plusieurs implémentations comme `ByteArrayInputStream` qui permet d'ouvrir un flux sur un tableau de `byte`.

```java
byte[] tableau = "Bonjour la famille".getBytes(); // on créé le tableau de byte nécéssaire pour déclarer le ByteArrayInputStream
ByteArrayInputStream inputStream = new ByteArrayInputStream(tableau);

int octet;
while ((octet = inputStream.read()) != -1) {
  System.out.println((char) octet);
}
```

L'implémentation `FileInputStream` permet d’ouvrir un flux de lecture binaire sur un fichier.

[Exemple de l'implémentation](./FileInputStreamEx.java)

### IOException et FileNotFoundException

`IOException` dans le cas ou un problème à l'éxecution des méthodes `.read` ou `.write`.

`FileNotFoundException` dans le cas ou le fichier n'a pas été trouvé (hérite de `IOException`).

## OutputStream et ses implémentations

[Exemple de l'implémentation](./CopyFile.java)

## FilterInputStream et FilterOutputStream

### Implémentations DataInputStream & DataOutpuStream