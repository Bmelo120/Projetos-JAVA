

package triangulocondicao;

import java.util.Scanner;



public class TrianguloCondicao {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      
      int X,Y,Z;
      
           
      System.out.println("Informe os lados do triangulo: ");
      X = sc.nextInt();
      Y = sc.nextInt();
      Z = sc.nextInt();
      
      if ( Y < X - Z & Y < X + Z ){
      System.out.println("É um Triangulo");
      } else if ( X < Y - Z & X < Y + Z ) {
         System.out.println("É um Triangulo");
         } else if (Z < X - Y & Z < X + Y) {
            System.out.println("É um Triangulo");   
         } else {
              System.out.println("Não é um Triangulo");  
         }
          
      
      
    }
    
}
