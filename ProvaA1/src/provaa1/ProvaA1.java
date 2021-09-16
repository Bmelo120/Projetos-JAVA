/*   
LISTA

(1) O nome e a altura do jogador mais alto.
(2) O nome e a altura do jogador mais baixo.
(3) A quantidade de jogadores registrados.
*/

package provaa1;

import java.util.Scanner;


public class ProvaA1 {

   
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
     
    String nome;
    double alt = 0.0;
    double quant = 0;
    
    double altmaior = 0.0;
    String nomemaior = null;
    double altmenor = 999.9;
    String nomemenor = null;
           
 
      
    while (1 != 0){
     System.out.println("Digite sua altura: ");
     System.out.println("Caso deseja finalizar digite -1");
     alt = sc.nextDouble();
     
     if (alt == -1){
    System.out.println("FINALIZADO");    
          break;  
    }   
     
    System.out.println("Digite seu nome: ");
    nome = sc.next();
    
    if  (alt>altmaior){
    altmaior = alt;
    nomemaior = nome;
    } else if (alt<altmenor){
    altmenor = alt;
    nomemenor = nome;
    }
    quant++;
     
    }
    System.out.println( "O maior jogador é " + nomemaior + "com" + altmaior + "m");
    System.out.println( "O menor jogador é " + nomemenor + "com" + altmenor + "m");
    System.out.println("Foi castrado o total de " + quant + "jogadores");
    
     
       
       
    }

    
}
