/* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação */
package exercicio;
import java.util.Locale;
import java.util.Scanner;

public class exc7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float x, y;

		System.out.println("Digite o valor de X:");
		x = sc.nextFloat();
		
		System.out.println("Digite o valor de Y:");
		y = sc.nextFloat();

		if (x > 0 && y > 0) {
			System.out.println("QUADRANTE Q1");
		
		}else if (x < 0 && y < 0) {
			System.out.println("QUADRANTE Q3");
		
		}else if (x > 0 && y < 0) {
			System.out.println("QUADRANTE Q4");
		
		}else if (x < 0 && y > 0) {
			System.out.println("QUADRANTE Q2");
		
		}else if (x > 0 && y < 0) {
			System.out.println("QUADRANTE Q4");
			
		}else if (x == 0 && y == 0) {
			System.out.printf("ORIGEM");
		
		}else if (x == 0 || y == 0) {
			
			if (x == 0) {
				System.out.println("EIXO X");
			} else if (y == 0) {
				System.out.println("EIXO Y");
			}
		
		}
		sc.close();
	}

}
	
