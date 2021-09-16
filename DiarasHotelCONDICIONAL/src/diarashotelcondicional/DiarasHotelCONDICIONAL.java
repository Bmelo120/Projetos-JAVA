

package diarashotelcondicional;

import java.util.Scanner;

public class DiarasHotelCONDICIONAL {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double valor = 0;
        int dias;
        
        System.out.println("Este programa irá informar o total a ser pago pelas diarias");
        System.out.println("Informe o tipo de apartamento");
        
        System.out.println("1-APARTAMENTO SIMPLES");
        System.out.println("2-APARTAMENTO DUPLO");
        
        System.out.println("Informe sua opção: ");
        int opcao = sc.nextInt();
        
        switch(opcao){
            case 1:
            System.out.println("Informe o numero de diarias: ");
            dias = sc.nextInt();
                
             if (dias < 10){
                 valor = 100;
                 System.out.println("O valor total das diarias será de " + valor);
             } else if (dias >= 10 && dias <= 15 ){
                 valor = 90;
                  System.out.println("O valor total das diarias será de " + valor);
             } else if (dias >= 16){
                 valor = 80;
                  System.out.println("O valor total das diarias será de " + valor);
             } 
            break;
                
            case 2: 
            System.out.println("Informe o numero de diarias: ");
            dias = sc.nextInt();
                
             if (dias <10){
               valor = 140;
                System.out.println("O valor total das diarias será de " + valor);
             } else if (dias >= 10 && dias <= 15){
                 valor= 120;
                  System.out.println("O valor total das diarias será de " + valor);
             } else if (dias >= 16){
                 valor = 100;
                  System.out.println("O valor total das diarias será de " + valor);
             }   
            break;
            default:
                 System.out.println("VALOR INVALIDOS!!!");
        }    
        
    }
    
}
