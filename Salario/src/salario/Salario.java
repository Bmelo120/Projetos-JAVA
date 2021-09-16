

package salario;

import java.util.Scanner;


public class Salario {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      double sal, nov, au;
      
      System.out.println ("Quanto você recebe atualmente ?");
      sal = sc.nextDouble();
      
      nov = sal * 45/100;
      au = nov + sal;
      
      
      System.out.println ("Após o aumento você recebera " + au);
      
    }
    
}
