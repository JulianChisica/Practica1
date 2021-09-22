
 
public class ejercicio4 {

    
    public static void main(String[] args) {
       double a = Math.random()*50;
        double b = Math.random()*50;
        
        System.out.println("el valor de a es:"+a);
        System.out.println("el valor de b es:"+b);
        
        long aentera = Math.round(a);
         long bentera = Math.round(b);
         
         System.out.println("el valor de a entera es:"+aentera);
         System.out.println("el valor de b entera es:"+bentera);
         
         int maximo =(int) Math.max(aentera, bentera);
         
         System.out.println("el valor maximo entre a y b es:"+maximo);
    }
    
}
