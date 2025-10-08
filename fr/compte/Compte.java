package fr.compte;
/**
 * La classe présente est une classe abstraite
 * Elle ne peut être instancié
 * Et n'a de sens que lorsqu'elle est hérité par une classe dérivée
 * 
 * Si la classe abstraite implément une interface, elle n'est pas obligé de déclarer ses méthodes,
 * seules les classes dérivées le devront
 */

public abstract class Compte implements ICompte {
  /**
   * L'intérêt d'utiliser une constante : Sécurité / perf mémoire
   * Elle ne peut pas être réaffectée
   */
  private final int id;
  private float solde;

  /**
   * Les deux constructeurs ici représentent une surcharge
   */
  public Compte() {
    ++nombreDeComptes;
    id = nombreDeComptes;
    solde = 0;
  }

  public Compte(float versementInitial) {
    ++nombreDeComptes;
    id = nombreDeComptes;
    solde = versementInitial;
  }

  public void verser(float mt) {
    this.solde = this.solde + mt;
  }

  public void retirer(float mt) throws Exception {
    this.solde = this.solde - mt;
  }

  public int getId() {
    return id;
  }

  public float getSolde() {
    return solde;
  }

  /**
   * En ajoutant final, j'empêche cette methode d'être redéfinie / @Override
   */
  public final void setSolde(float mt) {
     solde = solde + mt;
  }

  /**
   * L'attribut suivant est une variable de classe (et non d'instance)
   * Sa valeur persiste indépendemment de l'instance
   */
  static int nombreDeComptes = 0;

  /*
   * Ceci est une méthode abstraite, elle devrait être déclaré par chaque classe dérivée
   */
  public abstract void afficher();

}