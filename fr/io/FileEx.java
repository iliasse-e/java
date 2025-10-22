package fr.io;
import java.io.File;

public class FileEx {
  public static void main(String[] args) {

    // Créé le fichier test.txt
    File f = new File("\"C:\\Users\\elabo\\Documents\\Dev\\Java\\files\\test.txt\"");

    System.out.println("Absolute path : " + f.getAbsolutePath());

    // On navigue dans chaque lecteur
    for(File lecteur: File.listRoots()) {
      System.out.println(lecteur.getAbsolutePath());

      // On navigue dans chaque fichier
      for(File fichier: lecteur.listFiles()) {
        System.out.println("File name : " + fichier.getName());


        // On rend le fichier non modifiable
        fichier.setWritable(false);

        System.out.println("File can be read : " + fichier.canRead());
        System.out.println("File can be written : " + fichier.canWrite());
        System.out.println("File can be executed : " + fichier.canExecute());
      }
    }
    
  }
}