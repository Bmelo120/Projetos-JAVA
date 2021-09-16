
package esfera;

import java.util.Scanner;

public class Esfera {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       float R, C, A, V;
       
       System.out.println("Nos informe o raio da esfera: ");
       R = sc.nextFloat();
       
       C = (float) (2* 3.14 * R);
       A = (float) (3.14 * (R*R));
       V = (R*R*R)*(float) (0.75 * 3.14);
       
       System.out.println("O valor do Comprimento da esfera é: " + C);
          System.out.println("O valor da Area da esfera é: " + A);
             System.out.println("O valor do Volume da esfera é: " + V);
    }
    
}
