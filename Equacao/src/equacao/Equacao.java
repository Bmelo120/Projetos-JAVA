

package equacao;

import java.util.Scanner;


public class Equacao {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double a, b, c;
        double delta, x, x1, x2;
        
        System.out.println("Considere ax2 + bx + c = 0");
        System.out.println("Informe a: ");
        a = sc.nextDouble();
        System.out.println("Informe b: ");
        b = sc.nextDouble();
        System.out.println("Informe c: ");
        c = sc.nextDouble();
        
        delta = Math.pow(b,2) - 4*a*c;
        System.out.println("Valo de delta é: " + delta);
        
        if (delta > 0){
        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.println("Duas raizes reais x1= " + x1 + " e x2= " + x2);
        }else if (delta == 0){
        x = (- b)/(2*a);
        System.out.println("Uma raiz real x= " + x);
        }else {
        System.out.println("Não existe raiz real");
        }
    }
    
}
