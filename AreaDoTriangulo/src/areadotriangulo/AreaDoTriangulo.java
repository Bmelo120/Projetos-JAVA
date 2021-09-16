
/* (b * h)/2    */
package areadotriangulo;
import java.util.Scanner;

public class AreaDoTriangulo {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = 0.0;
        double h = 0.0;
        double A = 0.0;
        System.out.println("Informe a base: ");
        b = sc.nextDouble();
        System.out.println("Informe a altura");
        h = sc.nextDouble();
        A = (b * h)/2;
        System.out.printf ("A area do Triangulo é:  %.2f", A);
        System.out.println("");
        
    
}
}