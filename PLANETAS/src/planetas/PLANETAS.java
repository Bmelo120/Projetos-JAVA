

package planetas;

import java.util.Scanner;


public class PLANETAS {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int planeta;
        double v0, g, t, h, v;
        
        System.out.println("1- Mercurio, 2- Venus, 3- Terra, 4- Marte, 5- Jupter");
        System.out.println("6- Saturno, 7- Urano, 8- Neturno, 9- Plutão");
        System.out.print("Escolha um planeta: ");
        planeta = sc.nextInt();
        
        System.out.println("Informe a veliciade inicial: ");
        v0 = sc.nextDouble();
        System.out.println("Informe o tempo: ");
        t = sc.nextDouble();
        
        if (planeta == 1){
            g = 3.7;
        } else if (planeta == 2){
            g = 8.8;
        } else if (planeta == 3){
            g = 9.8;
        } else if (planeta == 4){
            g = 3.8;
        } else if (planeta == 5){
            g = 26.4;
        } else if (planeta == 6){
            g = 11.5;
        } else if (planeta == 7){
            g = 9.3;
        } else if (planeta == 8){
            g = 12.2;
        } else if (planeta == 9){
            g = 9.6;
        } else {
            g = 0;
            System.out.println("PLANETA INVALIDO!");
        }
        
        v = v0 - g*t;
        h = v0*t - (g*Math.pow(t,2))/2;
        
        System.out.println("Velociade: " + v);
        System.out.println("Altura: " + h);
    }
    
}
