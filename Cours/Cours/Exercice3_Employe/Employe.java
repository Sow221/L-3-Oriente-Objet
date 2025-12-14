public abstract class Employe {
    private String nom;
    private String prenom;
    
    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    // Méthode abstraite à implémenter
    public abstract double calculerSalaire();
    
    // Méthodes concrètes
    public String getNom() {
        return nom + " " + prenom;
    }
    
    public void afficherInfo() {
        System.out.println("Employé: " + getNom() + ", Salaire: " + calculerSalaire() + "€");
    }
}

