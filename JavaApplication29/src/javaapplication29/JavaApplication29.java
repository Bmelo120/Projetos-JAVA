/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication29;

import java.util.Scanner;



/**
 *
 * @author User
 */
public class JavaApplication29 {


    public static void main(String[] args) {
        
        
        double altura = 0.0 ;
        double altMenor = 240;
        double altMaior = 0.0;
        String nomeMaior = "";
        String nomeMenor = "";
        int quant = 0;
        int quantMaior = 0;
        int quantMenor = 0;
              
        Scanner sc = new Scanner(System.in);
        
        
        
        while(altura != -1){
            System.out.println("Informe a altura em centímetros: ");
            altura = sc.nextDouble();
                if(altura == -1){
                    break;
                }else if(altura <= 0 || altura > 240){
                    System.out.println("Altura não identificada!!");
                    continue;
                }
            
            
            if(altura > altMaior){
                altMaior = altura;
                System.out.println("Informe o nome: ");
                nomeMaior = sc.next();
                quantMaior++;
            
            }else if(altura < altMenor){
                altMenor = altura;
                System.out.println("Informe o nome: ");
                nomeMenor = sc.next();
                quantMenor++;
            }
            
        }
        if(quantMenor > 0 && quantMaior > 0){
            quant = quantMenor + quantMaior;
            System.out.println("\n          RESULTADOS: ");
            System.out.println("\n Atleta mais alto: " + nomeMaior + " - " + altMaior + "cm");
            System.out.println("\n Atleta mais baixo: " + nomeMenor + " - " + altMenor + "cm");
            System.out.println("\n O número de atletas cadastrados é: " + quant);
        }else
            System.out.println("NÃO HÁ RESULTADOS VÁLIDOS!!");
    }


    }
    

