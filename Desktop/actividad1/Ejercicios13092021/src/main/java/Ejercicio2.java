
public class Ejercicio2 {

    
    public static void main(String[] args) {
    int totalH, s, d, h;
    
    totalh = Integer.parseInt(args[]);
    s = totalH / (24*7);
    d = totalH % (24*7) / 24;
    h = totalH % 24;
    
    System.out.println("El total de " + totalH +" horas");
    System.out.println("se convierte a:");
    System.out.println(s + " semanas");
    System.out.println(d + " dias");
    System.out.println(h + " horas");
    
    }
    
}
