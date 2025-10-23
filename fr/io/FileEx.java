package fr.io;
import java.io.File;

public class FileEx {
  public static void main(String[] args) {

    // Créé le fichier test.txt
    File f = new File("\"C:\\Users\\elabo\\Documents\\Dev\\Java\\files\\test.txt\"");

    System.out.println("Absolute path : " + f.getAbsolutePath());

    // On rend le fichier non modifiable
    f.setWritable(false);
    f.setReadable(true);

    System.out.println("File can be read : " + f.canRead());
    System.out.println("File can be written : " + f.canWrite());
    System.out.println("File can be executed : " + f.canExecute());

    // On navigue dans chaque lecteur
    for(File lecteur: File.listRoots()) {
      System.out.println(lecteur.getAbsolutePath());

      // On navigue dans chaque fichier / dossier
      for(File fichier: lecteur.listFiles()) {

        if (fichier.isDirectory()) {
          System.out.println("Folder name : " + fichier.getName());
        } else {
          System.out.println("File name : " + fichier.getName());
        }


      }
    }
    
  }
}