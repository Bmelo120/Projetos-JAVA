

package idade;

import java.util.Scanner;


public class Idade {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int a;
       int i;
       double ii = 0, n1;
       
       System.out.println("Quantos anos você tem?");
       i = sc.nextInt();
       System.out.println("Em que ano estamos?");
       a = sc.nextInt();
       
      n1 = 2050 - a;
      ii = n1 + i;
      
      System.out.println("Em " + a + " voce tem " + i + " anos");
      System.out.println("Em 2050 voce tera " + ii + " anos");
      
        
        
       
    }
    
}
