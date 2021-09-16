

package losango;

import java.util.Scanner;


public class Losango {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int  maior, menor;
        double area;
        
        System.out.println("Informe a diagonal maior do Losango: ");
        maior = sc.nextInt();
        System.out.println("Informe a diagonal menor do Losango: ");
        menor = sc.nextInt();
        
        area = (maior * menor)/2;
        
        System.out.printf("A area do losango é :  %.2f ", + area );
        
    }
    
}
