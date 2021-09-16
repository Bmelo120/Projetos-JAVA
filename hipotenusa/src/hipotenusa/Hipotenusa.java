

package hipotenusa;

import static java.lang.Math.sqrt;
import java.util.Scanner;


public class Hipotenusa {

    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     float CA, CO, H, CALC;
     
     System.out.println("Digite o valor do cateto adjacente: ");
     CA = sc.nextFloat();
     System.out.println("Digite o valor do cateto oposto: ");
     CO = sc.nextFloat();
     
     CALC = (CA*CA)+(CO*CO);
     H = (float) sqrt(CALC);
     
     System.out.printf("O valor do hipotenusa é: " + H);
     
     
    }
    
}
