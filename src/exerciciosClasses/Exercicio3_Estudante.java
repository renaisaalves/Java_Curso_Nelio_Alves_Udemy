package exerciciosClasses;

import java.util.Scanner;
import classes.Estudante;

public class Exercicio3_Estudante {

	public static void main(String[] args) {
		
		/* 3) Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
		 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. 
		 * Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
		 * para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
		 * resolver este problema.*/
		
		Scanner scan = new Scanner(System.in);
		Estudante aluno = new Estudante();
		
		System.out.print("Nome: ");
		aluno.nome = scan.nextLine();
		
		System.out.print("Nota 1º trimestre: ");
		aluno.primeiroTrimestre = scan.nextInt();
		
		System.out.print("Nota 2º trimestre: ");
		aluno.segundoTrimestre = scan.nextInt();
		
		System.out.print("Nota 3º trimestre: ");
		aluno.terceiroTrimestre = scan.nextInt();
	
		System.out.println(aluno.resultado());
		
		scan.close();
	}

}
