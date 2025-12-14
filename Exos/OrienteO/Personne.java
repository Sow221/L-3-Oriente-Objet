public class Personne{
    private String nom;
    private String prenom;
    private int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }


     // Methodes d'affichage
     public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Âge: " + age);
    }

     // Méthodes d'accès (getters et setters)
      public void setNom(String nom){
        this.nom = nom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getNom(){
        return nom;

    }

    public String getPrenom(){
        return prenom;
    }

    public int getAge(){
        return age;
    }
  
}