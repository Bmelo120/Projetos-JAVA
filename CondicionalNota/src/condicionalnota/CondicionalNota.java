
package condicionalnota;

import java.util.Scanner;

public class CondicionalNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N1, N2, N3, N4, soma, media;
        String situacao="";
        
        System.out.println("Informe a sua nota em Matematica (entre 0 a 10):");
        N1 = sc.nextDouble();
        System.out.println("Informe sua nota em Portugues (entre 0 a 10):");
        N2 = sc.nextDouble();
        System.out.println("Informe sua nota em Historia (entre 0 a 10):");
        N3 = sc.nextDouble();
        System.out.println("Informe sua nota em Fisica (entre 0 a 10):");
        N4 = sc.nextDouble();
        
        soma = N1 + N2 + N3 + N4;
        media = soma/4;
        
        System.out.printf("\nA soma é %.2f a média é %.2f", soma, media);
        
        if (media < 6.0)
          situacao = "* REPROVADO *";
        else if (media >=6.0 && media<=7.0)
            situacao = "* RECUPERAÇÃO *";
        else 
            situacao = "* APROVADO *";
        System.out.println("\nSituação do aluno:" + situacao);
    }
    
    
}
