/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/
package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exc4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double horaInicial, horaFinal, duracao;

		System.out.println("Digite a hora inicial do jogo:");
		horaInicial = sc.nextDouble();

		System.out.println("Digite a hora final do jogo:");
		horaFinal = sc.nextDouble();

		if (horaFinal < horaInicial) {
			horaFinal += 24;
		}

		duracao = horaFinal - horaInicial;

		if (horaFinal == horaInicial) {
			System.out.println("O jogo durou 24.00 hora(s).");
		} else
			System.out.printf("O jogo durou %.2f hora(s).", duracao);

		sc.close();
	}

}
