

package valordafuncao;

import java.util.Scanner;


public class ValordaFuncao {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      
      double x, fx;
      
      x = sc.nextDouble();
      
      if(x < -2){
        fx = 2* x +2;  
      } else if(x >= -2 & x < 3) {
        fx = 3; 
      } else {
          fx = -x;
             }
       System.out.print(fx);
      
      
    }
    
}
