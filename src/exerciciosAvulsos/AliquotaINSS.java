package exerciciosAvulsos;

import java.util.Scanner;

public class AliquotaINSS {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// CÁLCULO DA GUIA PREVIDÊNCIA SOCIAL (GPS) 2025
		// Consiste em calcular o valor da parcela com base no código e porcentagem;
		//  perguntar se trabalha como autônomo (individual) ou está desempregado
		// (facultativo) 20%, 11%, 5%;
		// Se for facultativo, oferecer a opção dos 5%
		// Perguntar qual porcentagem de contribuição o usuário deseja aderir;
		// Se o usuário escolher a porcentagem 11%, efetuar o cálculo com base no valor
		// do salário mínimo vigente;
		// Se o usuário que escolheu a modalidade facultativo escolher a opção dos 5%,
		// perguntar se está inscrito no CAD-Único
		// Se a pessoa estiver, fazer o cálculo; se não estiver, dizer que não é
		// possível contribuir por essa porcentagem enquanto não tiver o cadastro no
		// Cad-Único;
		// se o usuário escolher as opções 20%, perguntar qual salário ele deseja
		// contribuir;
		// exemplo: se o usuário escolheu R$3000,00 calcular 20% de 3000,00
		// exibir na tela o valor da taxa a ser paga.
		
		double salarioMin = 1518.00;
		double valor = 0.0;
		System.out.println("CÁLCULO DA GUIA PREVIDÊNCIA SOCIAL (GPS)");
		System.out.print("Você trabalha como autônomo? (por conta própria)\nR: ");
		char resp = scan.next().charAt(0);
		if (resp == 's' || resp == 'S') {
			System.out.println("Então você se enquadra na categoria Contribuinte Individual\n");
		} else {
			System.out.println("Então você se enquadra na categoria Contribuinte Facultativo\n");
		}
		
		System.out.print("Qual alíquota deseja recolher?\n[20%] [11%]: ");
		int aliquota = scan.nextInt();
		while (aliquota != 20 && aliquota != 11) {
				System.out.print("Valor inválido\nDigite novamente: ");
				aliquota = scan.nextInt();
			}
		if (aliquota == 20) {
			System.out.print("Sobre qual salário de contribuição deseja recolher?\nR: ");
			double salarioInfo = scan.nextDouble();
			valor = 20 * salarioInfo / 100;
		} else if (aliquota == 11) {
			valor = 11 * salarioMin / 100;
		} else {
			
		}
		System.out.printf("O valor da parcela a ser paga é %nR$%.2f", valor);
		/*
		 * System.out.print("Salário de contribuição R$: "); 
		 * double valorInfo = scan.nextDouble(); 
		 * double salarioMin = 1518.00; 
		 * double aliquota20 = 20 * valorInfo / 100; 
		 * double aliquota11 = 11 * salarioMin / 100; 
		 * double aliquota5 = 5 * salarioMin / 100;
		 */

		scan.close();

	}

}
