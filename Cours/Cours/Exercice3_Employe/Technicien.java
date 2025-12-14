public class Technicien extends Employe {
    private double salaireHoraire;
    private int heuresTravaillées;
    
    public Technicien(String nom, String prenom, double salaireHoraire, int heuresTravaillées) {
        super(nom, prenom);
        this.salaireHoraire = salaireHoraire;
        this.heuresTravaillées = heuresTravaillées;
    }
    
    @Override
    public double calculerSalaire() {
        return salaireHoraire * heuresTravaillées;
    }
}

