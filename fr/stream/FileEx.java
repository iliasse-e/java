package fr.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileEx {
  public static void main(String[] args) throws IOException {

    try {
      Path file = Path.of("C:\\Users\\elabo\\Documents\\Dev\\Java\\java\\fr\\stream\\file.txt"); 
  
      Stream<String> fileStream = Files.lines(file);
  
      fileStream.forEach(data  -> System.out.println(data));

      fileStream.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
