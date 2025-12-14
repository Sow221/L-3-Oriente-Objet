public class Main {
    public static void main(String[] args) {
        // Création d'une instance de Personne
        Personne personne = new Personne("Seck", "Tayba", 30);
        personne.afficher();

        // Création d'une instance d'Etudiant
        Etudiant etudiant = new Etudiant("Seye", "Elhadj", 22, "123456", "Informatique");
        //etudiant.afficher();
        // Modification des attributs de l'étudiant
        etudiant.setNom("Mor");
        etudiant.afficher();
        String fil = etudiant.setFiliere("d2a");
        System.out.println("Filière modifiée: " + fil);
        etudiant.afficher();
        System.out.println("Apres modification:");
        etudiant.setAge(23);
        System.out.println("Âge modifié: " + etudiant.getAge());
    }
}