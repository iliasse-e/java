package fr.stream;

public class Voiture {
  
  private String marque;

  public Voiture(String marque) {
    this.marque = marque.toLowerCase();
  }

  public String getMarque() {
    return marque;
  }

  public String getPays() {
    if (marque.equals("toyota") || marque.equals("nissan") || marque.equals("honda")) {
      return "Japon";
    }
    else if (marque.equals("renault") || marque.equals("citroën") || marque.equals("peugeot")) {
      return "France";
    }
    return "Unknown";
  }
}