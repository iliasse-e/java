package fr.entreprise;

/**
 * L'object de cette classe est l'implémentation de l'interface Comparable
 * et de la définition par conséquent de la méthode compareTo()
 */
public class Employe implements Comparable {
  static boolean triParSalaire = true;
  String nom;
  String prenom;
  float salaire;

  public Employe( String nom, String prenom, float salaire) {
    this.nom = nom;
    this.prenom = prenom;
    this.salaire = salaire;
  }

  @Override
  public int compareTo(Object o) {
    Employe e = (Employe) o;
    if (triParSalaire) return (int)(salaire - e.salaire);
    if (this.nom.compareTo(e.nom) != 0) return this.nom.compareTo(e.nom);
    return this.prenom.compareTo(e.prenom);
  }

  @Override
  public String toString() {
    return "Employé " + this.nom + " " + this.prenom + ", dont le salaire est de : " + this.salaire + " €";
  }
    
}
