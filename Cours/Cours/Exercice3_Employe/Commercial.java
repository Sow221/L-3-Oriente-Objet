public class Commercial extends Employe {
    private double chiffreAffaires;
    private double pourcentageCommission;
    
    public Commercial(String nom, String prenom, double chiffreAffaires, double pourcentageCommission) {
        super(nom, prenom);
        this.chiffreAffaires = chiffreAffaires;
        this.pourcentageCommission = pourcentageCommission;
    }
    
    @Override
    public double calculerSalaire() {
        return chiffreAffaires * (pourcentageCommission / 100);
    }
}

