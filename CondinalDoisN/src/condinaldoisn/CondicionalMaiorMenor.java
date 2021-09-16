

package condinaldoisn;

import java.util.Scanner;

public class CondicionalMaiorMenor {
 
    public static void main(String[] args) {
      
    Scanner sc = new Scanner (System.in);
    int N1, N2;
    System.out.println("Digite um numero: ");
    N1 = sc.nextInt();
    System.out.println("Degite outro numero: ");
    N2 = sc.nextInt();
    
    if(N1 > N2){
        System.out.println("O maior é" + N1);
        System.out.println(N2 + "é o menor ");
      }else if (N1 < N2){
          System.out.println("O maior é" + N2);
          System.out.println( N1 + "É o menor " );
      }else
          System.out.println("Os dois numero são iguais");
   
    }
    
}
