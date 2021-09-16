

package dolar;

import java.util.Scanner;

public class Dolar {

  
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       double brl, dlr, cambio;
       
       System.out.print ("Informe o valor em Dolares:");
       dlr = input.nextDouble();
       
       System.out.print ("Informe a cotação do cambio real dolar:");
       cambio = input.nextDouble();
       
       brl = dlr * cambio;
       System.out.println("O valor em reais é: " + brl);
    }
    
}
