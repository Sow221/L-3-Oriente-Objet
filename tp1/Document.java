package tp1;

public class Document{
    String titre;
    String auteur;
    int date;
    String type;

    public Document(String titre, String auteur, int date, String type){
        this.titre = titre;
        this.auteur = auteur;
        this.date = date;
        this.type = type;
    }
    public String getTitre(){
        return this.titre;
    }
    public String getAuteur(){
        return this.auteur;
    }
    public int getDate(){
        return this.date;
    }
    public String getType(){
        return this.type;
    }
    
    public void afficher(){
        System.out.println("Titre: " + this.titre);
        System.out.println("Auteur: " + this.auteur);
        System.out.println("Date: " + this.date);
        System.out.println("Type: " + this.type);
    }

    public void modifier(String titre, String auteur, int date, String type){
        this.titre = titre;
        this.auteur = auteur;
        this.date = date;
        this.type = type;
    }
}