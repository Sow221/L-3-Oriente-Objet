class A 
{ 
    public void f(int n, float x) 
    { 
        System.out.println ("f(int n, float x) n = " + n + " x = " + x) ; 
    } 
    
    private void f(long q, double y) 
    { 
        System.out.println ("f(long q, double y) q = " + q + " y = " + y) ; 
    } 
    
    public void f(double y1, double y2) 
    { 
        System.out.println ("f(double y1, double y2) y1 = " + y1 + " y2 = " + y2) ; 
    } 
} 
