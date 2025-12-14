package tp1;

public class Memoire extends Document{
    String id;
    String universite;
    int nbPages;

    public Memoire(String titre, String auteur, int date, String type, String id, String universite, int nbPages){
        super(titre, auteur, date, type);
        this.id = id;
        this.universite = universite;
        this.nbPages = nbPages;
    }
    
    public int getNbPages(){
        return this.nbPages;
    }

    public String getId(){
        return this.id;
    }
    public String getUniversite(){
        return this.universite;
    }
    public void afficher(){
        super.afficher();
        System.out.println("ID: " + this.id);
        System.out.println("Universite: " + this.universite);
        System.out.println("Nombre de pages: " + this.nbPages);
    }
    
    public void modifier(String titre, String auteur, int date, String type, String id, String universite, int nbPages){
        super.modifier(titre, auteur, date, type);
        this.id = id;
        this.universite = universite;
        this.nbPages = nbPages;
    }
     
      public int AgeMemoire(int anneeActuelle){
        return 2025 - this.date;
    }
}