/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diasvividos;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class DiasVividos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int idade;
        int dias;
        
        System.out.println("Informe o nome: ");
        nome = sc.next();
        
        System.out.println("Informe idade: ");
        idade = sc.nextInt();
        
        dias = idade*365;
        
        System.out.println(nome + ", você ja viveu" +  dias + "dias");
        // TODO code application logic here
    }
    
}
