package fr.polymorphisme;

public interface ICompte {
  public void verser(float mt);
  public void retirer(float mt) throws Exception;
  public float getSolde();
  public int getId();
}