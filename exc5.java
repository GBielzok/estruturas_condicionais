/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/
package exercicio;
import java.util.Locale;
import java.util.Scanner;

public class exc5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo, quantidade;
		double total=0;

		System.out.println("Digite o código do item:");
		codigo = sc.nextInt();

		System.out.println("Digite a quantidade do item:");
		quantidade = sc.nextInt();

		if (codigo == 1) {
			total = 4.00 * quantidade;
			System.out.printf("Você comprou %d Cachorro-quente(s). Preço total: R$%.2f." ,quantidade ,total);
		
		} else if (codigo == 2) {
			total = 4.50 * quantidade;
			System.out.printf("Você comprou %d X-Salada(s). Preço total: R$%.2f." ,quantidade ,total);
		
		}else if (codigo == 3) {
			total = 5.00 * quantidade;
			System.out.printf("Você comprou %d X-Bacon(s). Preço total: R$%.2f." ,quantidade ,total);
		
		}else if (codigo == 4) {
			total = 2.00 * quantidade;
			System.out.printf("Você comprou %d Torrada(s) Simples. Preço total: R$%.2f." ,quantidade ,total);
		
		}else if (codigo == 5) {
			total = 1.50 * quantidade;
			System.out.printf("Você comprou %d Refrigerante(s) Simples. Preço total: R$%.2f." ,quantidade ,total);
		
		}else System.out.println("Código inválido.");

		sc.close();
	}

}
