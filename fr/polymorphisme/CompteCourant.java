package fr.polymorphisme;

public class CompteCourant extends Compte {

  public CompteCourant() {
    // super() ou pas, le constructeur de la classe parent est appelé
    System.out.println("Création du compte courant dont l'id est : " + getId());
  }

  public CompteCourant(float montantInitial) {
    super(montantInitial);
    System.out.println("Création du compte courant dont l'id est : " + getId());
  }

  /**
   * Méthode redéfinie (abstraite dans la classe mère)
   */
  @Override
  public void afficher() {
    System.out.println();
    System.out.println("****************************************");
    System.out.println("Le solde du compte courant est de : " + getSolde());
    System.out.println("L identifiant du compte simple est : " + getId());
    System.out.println("****************************************");
    System.out.println();
  }

}