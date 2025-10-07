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
    System.out.println("Retirer | Check si decouvert plafonné");
    if ((decouvertAutorise + this.getSolde()) > mt) {
      this.setSolde(this.getSolde() - mt);
      return;
    }
    throw new Exception("Votre decouvert depasse");
  }

  @Override
  public void afficher() {
    System.out.println("Le solde du compte simple est de : " + getSolde());
  }

}