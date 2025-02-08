package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class ExerciciosSequenciaisSimples {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		/* 1) Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.*/ 
		System.out.println("Digite um número: ");
		int x = scan.nextInt();
		System.out.println("Digite outro número: ");
		int y = scan.nextInt();
		
		int total = x + y;
		
		System.out.println("O total dos dois números informados é: " + total);
		
		/* 2) Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.*/
		System.out.print("Informe o valor do raio de um círculo: ");
		double raio = scan.nextDouble();
		double area = 3.14159 * (raio * raio);
		
		System.out.format("A área do círculo é: %.4f", area);
		
		/* 3) Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/ 
		System.out.println("Digite 4 valores numéricos:");
		System.out.print("Valor 1: ");
		int a = scan.nextInt();
		System.out.print("Valor 2: ");
		int b = scan.nextInt();
		System.out.print("Valor 3: ");
		int c = scan.nextInt();
		System.out.print("Valor 4: ");
		int d = scan.nextInt();
		
		int diferenca = a * b - c * d;
		
		System.out.println("Diferença: " + diferenca);
		
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
