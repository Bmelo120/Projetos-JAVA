

package peso;

import java.util.Scanner;


public class Peso {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int PA;
      double PEN, PEM; 
      
      System.out.println("Qual o seu peso atualmente? ");
      PA = sc.nextInt();
              
      PEN = PA * 15/100 + PA; // engorda 15% //
      
      PEM = PA * 20/100 - PA; // emagrecer 20% //
       
     System.out.println("Se você engordar 15% do seu peso, irá pesar: " + PEN);
     
     System.out.println("Se você emagrecer 20% do seu peso, irá pesar: " + PEM);
      
    }
    
}
