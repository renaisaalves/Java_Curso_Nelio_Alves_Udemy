package exerciciosCondicionaisLogicos;

import java.util.Scanner;

public class Exercicio8CL {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 8) Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		
		System.out.print("Salário: ");
		double salario = scan.nextDouble();
		
		if (salario > 0.00 && salario <= 2000.00) {
			System.out.println("ISENTO");
		} else if (salario > 2000.01 && salario < 3000.00) {
			double imposto = (8 * salario) / 100;
			System.out.printf("Imposto: R$ %.2f%n", imposto);
		} else if (salario > 3000.01 && salario <= 4500.00) {
			double imposto = (18 * salario) / 100;
			System.out.printf("Imposto: R$ %.2f%n", imposto);
		} else {
			double imposto = (28 * salario) / 100;
			System.out.printf("Imposto: R$ %.2f%n", imposto);
		}
		
		scan.close();

	}

}
