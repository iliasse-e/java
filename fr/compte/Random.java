package fr.compte;

/*
 * Une classe peut aussi être déclarée en final
 * Sécurité, rapidité et perf mémoire
 */
public final class Random {
  private final double randomAttribute;

  public Random() {
    randomAttribute = Math.random();
  }

  public double getRandomAttribute() {
    return randomAttribute;
  }
}
