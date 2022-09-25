/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
package exercicio;

import java.util.Scanner;

public class exc1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número inteiro:");
		num = sc.nextInt();
		
		if (num<0) {
			System.out.println("O número "+num+" é negativo!");
		
		}else System.out.println("O número "+num+" não é negativo!"); 
		
		sc.close();
	}

}
