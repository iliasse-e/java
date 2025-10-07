import fr.compte.*;

public class MainApp {

  public static void main(String[] args) throws Exception {

    Compte c1 = new CompteCourant();
    Compte c2 = new CompteSimple();

    c1.verser(300);
    c1.afficher();
  
    try {
      c2.retirer(20000);
    } catch (Exception e) {
      throw e;
    }
    
    c2.afficher();
  }
}