package fr.fruit;

public class Orange implements IFruit {

  @Override
  public void pousser() {
    System.out.println("method 'pousser'");
  }

  @Override
  public void tomber() {
    System.out.println("method 'tomber'");
  }
  
}
