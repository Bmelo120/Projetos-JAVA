

package tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
       int x;  
       int tabuada = 0;
       int y;
      
       System.out.println("Digite um numero que deseja a tabuada: ");
       x = sc.nextInt();  
       System.out.println();
       
       while ( tabuada <= 10){
       
       y = x * tabuada;
       
       System.out.println(y);
       tabuada++;
       }   
    
         
         
    
    }
       
    }
    

