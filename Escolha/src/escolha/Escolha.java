
package escolha;

import java.util.Scanner;

public class Escolha {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double a = 0;
        double b = 0;
        double R = 0;
        
        System.out.println("Informe o primeiro numero: ");
        a = sc.nextDouble();
        System.out.println("Informe o segundo numero: ");
        b = sc.nextDouble();
        
        System.out.println("\nPara os numero informados, voce deseja: ");
                  
        System.out.println("1-Somar?");
        System.out.println("2-Subtrair?");
        System.out.println("3-Multiplicar?");
        System.out.println("4-Divivir?");
        
        System.out.println("Informe a opção: ");                       
        int opcao = sc.nextInt();
        
        switch (opcao){
            case 1:
                R = (a + b);
                System.out.println("A soma é " + R);
                break;
            case 2:
                R = (a - b);
                System.out.println("A subtração é " + R);
                break;
            case 3:
                R = (a * b);
                System.out.println("A multiplicação é: " + R);
                break;
            case 4:
                if (b == 0 )
                   System.out.println("Impossivel dividir por zero");
                else {
                R = (a / b);
                System.out.println("A divisão é: " + (a / b));
                }
                break;
                 default:
                  System.out.println("Opção inválida!");
                     }
        System.out.println("* PROGRAMA FINALIZADO *");
        }
       
    }
   
