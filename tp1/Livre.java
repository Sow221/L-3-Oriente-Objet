package tp1;

public class Livre extends Document{
    String id;
    String editeur;
    int nbPages;

    //

    public Livre(String titre, String auteur, int date, String type, String id, String editeur, int nbPages){
        super(titre, auteur, date, type);
        this.id = id;
        this.editeur = editeur;
        this.nbPages = nbPages;
    }
    
    public int getNbPages(){
        return this.nbPages;
    }

    public String getId(){
        return this.id;
    }
    public String getEditeur(){
        return this.editeur;
    }


    public void afficher(){
        super.afficher();
        System.out.println("ISBN: " + this.id);
        System.out.println("Editeur: " + this.editeur);
        System.out.println("Nombre de pages: " + this.nbPages);
    }
    
    public void modifier(String titre, String auteur, int date, String type, String id, String editeur, int nbPages){
        super.modifier(titre, auteur, date, type);
        this.id = id;
        this.editeur = editeur;
        this.nbPages = nbPages;
    }
     

    public int AgeLivre(){
    int anneeActuelle = java.time.Year.now().getValue();
    return anneeActuelle - this.date;
}


}