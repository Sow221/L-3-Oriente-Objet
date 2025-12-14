public class TestEtudiant{
    public static void main (String[] args){
        Etudiant e = new Etudiant("Mor", "Seye", "Thies", 40000, 2008);
        e.affiche();
        EtudiantEtranger e2 = new EtudiantEtranger("Seynabou", "Seck", "Mbour", 50000, 2010, "Bourkina Faso");
        e2.affiche();
        e2.manger();
    }
}