public class Personne{
    String prenom;
    String nom;

   public Personne(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }



    public void affiche(){
        System.out.println("Prenom: " +  prenom + ", Nom: " + nom);
    }

    public void saluer(){
      System.out.println("Bonjour " + prenom + " " + nom);
    }
}
