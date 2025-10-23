package fr.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx {

  public static void main(String[] args) throws IOException {
    
    try (InputStream stream = new FileInputStream("./README.md")) {
      byte[] buffer = new byte[1024];

      int nbRead;
      while ((nbRead = stream.read(buffer)) != -1) {
        System.out.println(nbRead);
      }
    }
  }
}
