package fr.io;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class InputStreamEx {

  public static void main(String[] args) {
    byte[] tableau = "Bonjour la famille".getBytes();
    ByteArrayInputStream inputStream = new ByteArrayInputStream(tableau);

    int octet;
    while ((octet = inputStream.read()) != -1) {
      System.out.println(octet);
    }
  }
  
}
