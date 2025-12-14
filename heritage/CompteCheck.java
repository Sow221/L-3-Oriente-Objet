package heritage;

public class CompteCheck extends CompteB{
    double decouvert;
    double montant;

    public CompteCheck(int numero, double solde, double decouvert){
        super(numero, solde);
        this.decouvert = decouvert;
    }

    
    public void retirer(double montant){
        if(montant <= solde + decouvert){
            this.solde -= montant;
        }else{
            System.out.println("Fonds insuffisants, decouvert depasse");
        }
    }

    public static void main(String[] args){
        CompteCheck cc = new CompteCheck(123, 15000.60, 5000.40);
        cc.retirer(20000);
        cc.afficher();
    }
}