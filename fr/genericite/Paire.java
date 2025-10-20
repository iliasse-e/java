package fr.genericite;


public class Paire<U, V> {

  private U valeurGauche;
  private V valeurDroite;

  public Paire(U valeurGauche, V valeurDroite) {
    this.valeurGauche = valeurGauche;
    this.valeurDroite = valeurDroite;
  }

  public U getValeurGauche() {
    return valeurGauche;
  }

  public V getValeurDroite() {
    return valeurDroite;
  }

  @Override
  public String toString() {
    return valeurGauche + " " + valeurDroite;
  }

  public void setValeurGauche(U valeurGauche) {
    this.valeurGauche = valeurGauche;
  }

  public void setValeurDroite(V valeurDroite) {
    this.valeurDroite = valeurDroite;
  }

  /**
   * Méthode générique.
   * Pour déclarer une méthode générique, il faut décrire le type ou les types paramétrés supportés entre < >
   */
  public <T> boolean compare(T a, T b) {
    return a.equals(b);
  }

}