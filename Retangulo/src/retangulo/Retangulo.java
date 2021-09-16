
/* perimetro = 2 * altura + 2 * lado
   area = altura * lado; */
package retangulo;
import java.util.Locale;
import java.util.Scanner;


public class Retangulo {

    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        double a = 0.0;
        double h = 0.0;
        double p = 0.0;
        double l = 0.0;
        
        System.out.println("Informe a altura: ");
        h = sc.nextDouble();
        System.out.println("Informe o lado: ");
        l = sc.nextDouble();
        
        p = 2 * h + 2 * l;
        a = h * l;
        
        System.out.printf("Área %.2f m2", a);
        System.out.printf("\nPerimetro %.2f metros", p);
        System.out.println("");
        
       
        
        
        
    }
    
}
