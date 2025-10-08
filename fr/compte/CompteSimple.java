package fr.compte;

public class CompteSimple extends Compte {
  private float decouvertAutorise;

  public CompteSimple() {
    super();
    this.decouvertAutorise = 500;
  }

  public CompteSimple(float montantInitial, float decouvertAutorise) {
    super(montantInitial);
    this.decouvertAutorise = decouvertAutorise;
  }

  /*
   * Cette méthode existe déjà dans la classe abstraite héritée,
   * Ici elle est redéfinie
   */
  @Override
  public void retirer(float mt) throws Exception {
    if ((decouvertAutorise + this.getSolde()) > mt) {
      this.setSolde(this.getSolde() - mt);
      return;
    }
    throw new Exception("Votre decouvert depasse");
  }

  /**
   * Méthode redéfinie (abstraite dans la classe mère)
   */
  @Override
  public void afficher() {
    System.out.println();
    System.out.println("****************************************");
    System.out.println("Le solde du compte simple est de : " + getSolde());
    System.out.println("L identifiant du compte simple est : " + getId());
    System.out.println("Le decouvert autorise du compte simple est de : " + decouvertAutorise);
    System.out.println("****************************************");
    System.out.println();
  }

}