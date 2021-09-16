
package atividaderevisão;
import java.util.Scanner;

public class ProvaA1 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

double altura = 0.0;
double alturaMaior = 0.0;
double alturaMenor = 999.9;
int contJogador = 0;
String nome;
String nomeMaior = null;
String nomeMenor = null;


while(altura != -1){
System.out.println("Informe a altura do jogador (em metros) [INSIRA -1 PARA ENCERRAR O PROGRAMA]");
altura = sc.nextDouble();
if(altura == -1){
System.out.println("PROGRAMA ENCERRADO!");
break;
} else
contJogador++;

System.out.println("Informe o nome do jogador");
nome = sc.next();

if(altura > alturaMaior) {
alturaMaior = altura;
nomeMaior = nome;

} if(altura < alturaMenor) {
alturaMenor = altura;
nomeMenor = nome;
}
}
System.out.println("O nome do maior jogador "+nomeMaior+" e sua altura "+alturaMaior+ " m");
System.out.println("O nome do menor jogador "+nomeMenor+" e sua altura "+alturaMenor+ " m");
System.out.println("A quantidade de jogadores registrado : "+contJogador);
}
}