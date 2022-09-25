/* Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

de R$0.00 a R$ 2000.00 - Isento
de R$2000.01 até R$ 3000.00 - 8%
de R$3000.01 até R$4500.00 - 18%
acima de R$ 4500.00 - 28%

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
*/
package exercicio;
import java.util.Locale;
import java.util.Scanner;

public class exc8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float salario, imposto;

		System.out.println("Digite o seu salário:");
		salario = sc.nextFloat();
		

		if (salario > 0 && salario < 2000.00) {
			System.out.println("Isento de imposto.");
		
		}else if (salario > 2000 && salario < 3000) {
			imposto = (salario - 2000) * 8 / 100;
			System.out.printf("Taxa de imposto: R$%.2f" ,imposto);
		
		}else if (salario > 3000 && salario < 4500) {
			imposto = 1000 * 8 / 100;
			imposto += (salario - 3000) * 18 /100;
			System.out.printf("Taxa de imposto: R$%.2f" ,imposto);
		
		}else if (salario > 4500) {
			imposto = 2000 * 18 / 100;
			imposto += (salario - 4500) * 28 / 100;
			System.out.printf("Taxa de imposto: R$%.2f" ,imposto);
		
		}else System.out.print("Salário incompatível.");
		
		sc.close();
	}

}
	
