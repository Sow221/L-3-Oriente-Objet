public class Manager extends Employe {
    private double salaireFixe;
    private double prime;
    
    public Manager(String nom, String prenom, double salaireFixe, double prime) {
        super(nom, prenom);
        this.salaireFixe = salaireFixe;
        this.prime = prime;
    }
    
    @Override
    public double calculerSalaire() {
        return salaireFixe + prime;
    }
}

