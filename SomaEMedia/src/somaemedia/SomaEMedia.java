

package somaemedia;

import java.util.Scanner;

public class SomaEMedia {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int N1, N2, N3;
        int S;
        double M;
        
        System.out.println("Informe o primeiro numero:");
        N1 = entrada.nextInt ();
        System.out.println("Informe o segundo numero:");
        N2 = entrada.nextInt ();
        System.out.println("Informe o terceiro numero:");
        N3 = entrada.nextInt ();
        
        S = N1+N2+N3;
        
        M = N1+N2+N3/3;
        
        System.out.println("A soma dos 3 numeros é: " + S);
      
        System.out.println ("A media dos 3 numeros é: " + M);
       
        
    }
    
}
