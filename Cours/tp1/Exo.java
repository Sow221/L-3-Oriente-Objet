package tp1;

public class Exo{

    public static void main(String[] args){

        System.out.println("Infos sur Document");

        Document doc = new  Document("Lecon java", "M.Sow", 2024, "pdf");
        doc.afficher();
        doc.modifier();

        System.out.println("Infos sur Livre");

        Livre li = new Livre("Lecon java", "M.Sow", 2024, "pdf","123","MS-EDIT", 12);
        //li.getNbPages();
        //li.getIsbn();
        li.afficher();
        li.modifier("Lecon 2", "BSS", 2025, "ROMAN", "1234", "SEDIT", 10);

        
        Memoire m = new Memoire("fin d annee", "Tayba", 2024, "memoire", "234", "UADB", 12);
        m.afficher();

        
    }
}