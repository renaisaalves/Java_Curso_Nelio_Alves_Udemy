package exerciciosSequenciais;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		/* 4) Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/
		System.out.print("Informe o seu número de inscrição: ");
		int numInscricao = scan.nextInt();
		System.out.print("Informe sua escala de horário: ");
		int horasTrabalhadas = scan.nextInt();
		System.out.print("Informe o valor que recebe por hora: ");
		double valorHora = scan.nextDouble();
		
		double salario = (horasTrabalhadas * valorHora) * 30;
		
		System.out.printf("Número de inscrição: %d%n Escala: %d%n Horas trabalhadas: %.1f%n Salário: R$%.2f", numInscricao, horasTrabalhadas, valorHora, salario);
		
		scan.close();

	}

}
