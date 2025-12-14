public class Etudiant  extends Personne{
    private String codePermanent;
    private String filiere;


    public Etudiant(String nom, String prenom, int age, String codePermanent, String filiere) {
        super(nom, prenom, age);
        this.codePermanent = codePermanent;
        this.filiere = filiere;
    }


     public void afficher(){
        super.afficher();
        System.out.println("Code Permanent: " + codePermanent);
        System.out.println("Filière: " + filiere);
     }


    public String setcodePermanent(String codePermanent) {
        this.codePermanent = codePermanent;
        return codePermanent;
    }

    public String getcodePermanent() {
        return codePermanent;
    }

    public String setFiliere(String filiere) {
        this.filiere = filiere;
        return filiere;
    }
    public String getFiliere() {
        return filiere;
    }


}