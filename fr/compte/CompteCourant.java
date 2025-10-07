package fr.compte;

public class CompteCourant extends Compte {

  public CompteCourant() {
    super();
  }

  public CompteCourant(float montantInitial) {
    super(montantInitial);
  }

  /**
   * Méthode 
   */
  @Override
  public void afficher() {
    System.out.println("Le solde du compte courant est de : " + getSolde());
  }

}