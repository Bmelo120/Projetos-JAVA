
package diariasdohotel;

import java.util.Scanner;


public class DiariasdoHotel {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int Dia;
        double taxa,TD;
        
        System.out.println("Digite o numero de dias que pretende ficar no hotel: ");
        Dia = sc.nextInt();
        
        if ( Dia < 15){
           taxa = 15; 
        } else if ( Dia == 15){
            taxa = 10;
        } else {
            taxa = 5;
        }
        
        TD = Dia*500 + Dia*taxa;
        
        System.out.println(" Você ira pagar " + TD );
    }
    
}
