

package temperatura;

import java.util.Scanner;


public class Temperatura {

    
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     double Cel, EUA;
     
     System.out.println("Informe os graus em celsius: ");
     Cel = sc.nextDouble();
     
     EUA = ((Cel*1.8)+32);
     
     System.out.println("Os grau em Fahrenheit são: " + EUA);
             
    }
    
}
