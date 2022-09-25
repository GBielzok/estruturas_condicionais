/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar*/
package exercicio;
import java.util.Scanner;

public class exc2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número inteiro:");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O número "+num+" é par!");
		
		}else System.out.println("O número "+num+" é ímpar!"); 
		
		sc.close();
	}

}
