package fr.entreprise;
import java.util.Arrays; /* On va utiliser la méthode static .sort() */

public class Entreprise {
  static Employe[] liste;

  public Entreprise(int nombreDemployes) {
    this.liste = new Employe[nombreDemployes];
  }

  public void remplir() {
    this.liste[0] = new Employe("Gérard", "Deleuze", 2700);
    this.liste[1] = new Employe("Vincent", "Delatruc", 2300);
    this.liste[2] = new Employe("Bouma", "Batkl", 3700);
    this.liste[3] = new Employe("Othman", "Dörtk", 3700);
    this.liste[4] = new Employe("Xu", "Ming", 3700);
  }

  public void lister() {
    for (Employe e: liste) {
      System.out.println(e.toString());
    }
  }

  public void ordonner(boolean parSalaire) {
    Employe.triParSalaire = parSalaire;
    /*
     * La méthode .sort() utilise la méthode .compareTo() du type d'élément qui constitue le tableau
     */
    Arrays.sort(this.liste);
  }
  
}
