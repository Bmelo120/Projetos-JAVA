

package academia;

import java.util.Scanner;


public class Academia {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      
      double valor = 0;
      int idade;
      
      System.out.println("Este programa irá informar sua mensalidade nesta academia");
      System.out.println("Digite a opção de sua sexualidade");
      
      System.out.println("1-FEMININO");
      System.out.println("2-MASCULINO");
      
      System.out.println("Informe a opção: ");
      int opcao = sc.nextInt();
      
      switch(opcao){
          case 1:
              System.out.println("Informe sua idade: ");
              idade = sc.nextInt();
              
              if(idade <= 18){
                  valor = 60;
                  System.out.println("O valor da sua mensalidade será de " + valor);
                  } else if (idade >= 19 && idade <= 25){
                      valor = 90;
                      System.out.println("O valor da sua mensalidade será de " + valor);
                  } else if (idade >= 26 && idade <= 40){
                      valor = 85;
                      System.out.println("O valor da sua mensalidade será de " + valor);
                  } else if (idade >= 41){
                      valor = 80;
                      System.out.println("O valor da sua mensalidade será de " + valor);
                  }
                  break;
          case 2:
              System.out.println("Informe sua idade: ");
              idade = sc.nextInt();
              
              if (idade <= 15){
                  valor = 60;
                  System.out.println("O valor da sua mensalidade será de " + valor);
                  } else if (idade <=16 && idade <= 18){
                     valor =  75;
                     System.out.println("O valor da sua mensalidade será de " + valor);
                  } else if (idade >= 19 && idade <= 30){
                      valor = 90;
                      System.out.println("O valor da sua mensalidade será de " + valor);
                  } else if (idade >= 31 && idade <= 40){
                      valor = 85;
                      System.out.println("O valor da sua mensalidade será de " + valor);
                  } else if (idade >= 41) {
                      valor = 80;
                      System.out.println("O valor da sua mensalidade será de " + valor);
                  }
                  break;
          default:
              System.out.println("NUMERO INVALIDO!!");
      }
              
    }
    
}
