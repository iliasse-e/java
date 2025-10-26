package fr.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
  public static void main(String[] args) throws IOException {
    
    try {
      // On récupère un fichier, pour en faire un inputstream (flux de lecture)
      File file1 = new File("C:\\Users\\elabo\\Documents\\Dev\\Java\\java\\fr\\io\\test1.txt");
      FileInputStream fileInputStream = new FileInputStream(file1);

      // On créé un second fichier, à partir duquel on va créé un outputstream (flux d'écriture)
      File file2 = new File("test2.txt");
      FileOutputStream fileOutputStream = new FileOutputStream(file2);

      int n = 0;

      // On itère dans le fichier 1 (inputStream)
      while ((n = fileInputStream.read()) != -1) {
        // On inscrit ce qu'on parcours dans le fichier 1 dans le fichier 2 (outputStream)
        fileOutputStream.write(n);

        // On cast la valeur de byte vers char
        System.out.println(n + "(" + (char) n + ")");
      }

      // On rompt les deux flux (pour ne pas créé de fuite de mémoire)
      fileInputStream.close();
      fileOutputStream.close();

      

    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
