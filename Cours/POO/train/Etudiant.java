public class Etudiant extends Personne{
    String codePermanent;

    public Etudiant(String prenom, String nom, String codePermanent){
        super(prenom, nom);
        this.codePermanent = codePermanent;
    }
     
     @Override
    public void affiche(){
        super.affiche();
        System.out.println("Code Permanent: " + codePermanent);
    }

    public void CodePermanent(int codePermanent){
        this.codePermanent = "CP" + codePermanent;
    }

     public static void main(String[] args){
        Personne p = new Personne("Jean", "Dupont");
        p.affiche();
        p.saluer();

        System.out.println("Creation du profil etdudiant:");
        Etudiant e = new Etudiant("Marie", "Curie", "MC123456");
        e.affiche();
        e.CodePermanent(123456);
    }
}