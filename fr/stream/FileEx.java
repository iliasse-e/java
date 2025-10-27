package fr.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FileEx {
  public static void main(String[] args) throws IOException {

    OptionalInt doubleHighestInt = IntStream.of(20, 10).reduce((n1, n2) -> Math.max(n1, n2) * 2);

    List<String> liste = Arrays.asList("une chaine", "une autre chaine", "encore une chaine");
List<String> autreListe = liste.stream().collect();


    try {
      Path file = Path.of("C:\\Users\\elabo\\Documents\\Dev\\Java\\java\\fr\\stream\\file.txt"); 
  
      Stream<String> fileStream = Files.lines(file);
  
      fileStream.forEach(data  -> System.out.println(data));

      fileStream.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println(doubleHighestInt);


  }
}
