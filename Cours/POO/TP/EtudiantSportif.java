
public class EtudiantSportif extends Etudiant{
    String sport;
    public EtudiantSportif(String nom, String prenom, String adr, double bourse,int annee, String sport) {
        super(nom, prenom, adr, bourse, annee);
        this.sport = sport;
    }

    public void vitesse(){
        System.out.println("Vitesse maximale: 10 km/h !");
    }

    public void affiche(){
        System.out.println("Le sport pratique" + sport);
    }
}