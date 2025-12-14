package TP; 

public class Point{
    int x,y, r;

    //Constructeur sans parametre
    public Point(){
        this.x = 0;
        this.y = 0;
    }
   //Constructeur avec parametre
 public Point(int x, int y){
    this.x = x;
    this.y = y;
 }
 
 public Point(int x, int y, int r){
    this();
    this.r = r;
    System.out.println(" Le rayon du cercle est : " + r);

 }

 public void affiche(){
       System.out.println("Point de coordonnees: (" + x + ", " + y + ")");
 }



 //Methode main
 public static void main(String[] args){
    Point p0 = new Point();
    p0.affiche();
    Point p1 = new Point(3,4);
    p1.affiche();
    Point p2 = new Point(3,4,2);
    p2.affiche();
 }
}