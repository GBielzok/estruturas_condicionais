/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/
package exercicio;
import java.util.Scanner;

public class exc3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite um número inteiro:");
		num1 = sc.nextInt();
		
		System.out.println("Digite mais um número inteiro:");
		num2 = sc.nextInt();
		
		if (num1 >= num2 ) {
			
			if (num1 % num2 == 0) {
				
				System.out.println("Os números são múltiplos!");
			
			}else System.out.println("Os números não são múltiplos!");
			
		
		}else if (num2 >= num1) {
			
			if (num2 % num1 == 0) {
				
				System.out.println("Os números são múltiplos!");
			
			}else System.out.println("Os números não são múltiplos!");
			
		}
		
		sc.close();
	}

}
