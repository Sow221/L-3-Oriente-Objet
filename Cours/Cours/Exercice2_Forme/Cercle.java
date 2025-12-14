public class Cercle extends Forme {
    private double rayon;
    
    public Cercle(double rayon) {
        this.rayon = rayon;
    }
    
    @Override
    public double aire() {
        return Math.PI * rayon * rayon;
    }
    
    @Override
    public void description() {
        System.out.println("Cercle de rayon " + rayon);
    }
}

