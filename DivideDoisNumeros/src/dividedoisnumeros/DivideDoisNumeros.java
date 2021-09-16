


package dividedoisnumeros;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class DivideDoisNumeros {
      /*
    TEORIA - MODULO 1 - SLIDE 9
    
    ALGORITMO
        DECLARE N1, N2, D NUMÉRICO
        ESCREVA "Digite os dois números"
        LEIA N1, N2
        SE N2 = 0
        ENTÃO ESCREVA "Impossível dividir"
        SENÃO INÍCIO

            D ← N1/N2
            ESCREVA "Divisão = ", D
        FIM

    FIM_ALGORITMO
    
    */
   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        double primeiroValor;
        double n2;
        double d;
        
        System.out.println("Digite o primeiro numero: ");
        primeiroValor = sc.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextDouble();
        
       d = primeiroValor/n2;
       
       System.out.println("O resultado é: " + d);
        
        // TODO code application logic here
        
    }
    
}
