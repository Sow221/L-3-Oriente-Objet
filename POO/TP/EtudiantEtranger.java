

public class EtudiantEtranger extends Etudiant {
    String pays;

    public EtudiantEtranger(String nom, String prenom, String adr, double bourse, int annee, String pays) {
        super(nom, prenom, adr, bourse, annee);
        this.pays = pays;
    }
     
     public void voyager() {
        System.out.println("Je voyage deux fois dans l annee .");
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Le pays : " + pays);
    }

}