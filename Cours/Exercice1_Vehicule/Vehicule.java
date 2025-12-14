public abstract class Vehicule {
    // Méthode abstraite à implémenter
    public abstract void demarrer();
    
    // Méthode concrète
    public void stopper() {
        System.out.println("Le véhicule s'arrête");
    }
}

