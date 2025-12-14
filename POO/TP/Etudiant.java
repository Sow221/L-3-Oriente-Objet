public class Etudiant{
    String nom,prenom, adr;
    double bourse;
    int annee;

    public Etudiant(String nom, String prenom, String adr, double bourse, int annee){
        this.nom = nom;
        this.prenom = prenom;
        this.adr = adr;
        this.bourse = bourse;
        this.annee = annee;
    }

    public void manger(){
        System.out.println("Je mange avec la main !");
    }

    public void affiche(){
        System.out.println("Les informations de l etduiant :"   +
        "\nNom: " + nom +
        "\nPrenom: " + prenom +
        "\nAdresse: " + adr +
        "\nBourse: " + bourse +
        "\nAnnee d inscription: " + annee);
    }


    public static void main(String[] args){
        Etudiant etudiant = new Etudiant("Moussa", "Sow", "123 Rue Bmabey", 40000, 2025);
        etudiant.manger();
        etudiant.affiche();
    }
}