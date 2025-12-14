
package heritage;

public class CompteB {

    int numero;
    double solde;

    public CompteB(int numero, double solde){
        this.numero = numero;
        this.solde = solde;
    }

    public int getNumero(){
        return this.numero;
    }
    public void deposer(double montant){
        this.solde += montant;
    }
    public void retirer(double montant){
        if(montant <= this.solde){
            this.solde -= montant;
        }else{
            System.out.println("Fonds insuffisants");
        }
    }

    public void afficher(){
        System.out.println("CompteB Numero: " + this.numero + ", Solde: " + this.solde);
    }
    

}