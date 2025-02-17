package exerciciosAvulsos;

import java.util.Scanner;

public class AliquotaINSS {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("CÁLCULO DA GUIA DA PREVIDÊNCIA SOCIAL (GPS) 2025\n");
		
		double salarioMin = 1518.00;
		double salarioContribuicao;
		double parcela;
		
		
		System.out.println("Contribuinte Individual:\nCódigo 1007 [20%]\nCódigo 1163 [11%]\n");
		System.out.println("Contribuinte Facultativo:\nCódigo 1406 [20%]\nCódigo 1473 [11%]\nCódigo 1929 [5%]\n");
		
		System.out.print("Qual categoria você pertence? [Individual ou Facultativo]\nResposta: ");
		char categoriaEspecie = scan.next().charAt(0);
		
		while (categoriaEspecie != 'i' && categoriaEspecie != 'I' && categoriaEspecie != 'f' && categoriaEspecie != 'F') {
			System.out.print("Categoria inválida. Por favor, insire a categoria novamente: ");
			categoriaEspecie = scan.next().charAt(0);
		} // Enquanto a resposta não for Individual ou Facultativo, o programa não prosseguirá para a próxima etapa.
		
		System.out.print("Qual alíquota você deseja recolher?\nResposta: ");
		
		if (categoriaEspecie == 'i' && categoriaEspecie == 'I') {
			int aliquota = scan.nextInt();
			while(aliquota != 20 && aliquota != 11) {
				System.out.print("Alíquota incorreta. Digite novamente: ");
				aliquota = scan.nextInt();
			}
			if (aliquota == 20) {
				System.out.print("Sobre qual salário você deseja contribuir?\nResposta: R$");
				salarioContribuicao = scan.nextDouble();
				parcela = 20 * salarioContribuicao / 100;
			} else {
				parcela = 11 * salarioMin / 100;
			}
			
		} else {
			int aliquota = scan.nextInt();
			while(aliquota != 20 && aliquota != 11 && aliquota != 5) {
				System.out.print("Alíquota incorreta. Digite novamente: ");
				aliquota = scan.nextInt();
			}
			if (aliquota == 20) {
				System.out.print("Sobre qual salário você deseja contribuir?\nResposta: R$");
				salarioContribuicao = scan.nextDouble();
				parcela = 20 * salarioContribuicao / 100;
			} else if (aliquota == 11) {
				parcela = 11 * salarioMin / 100;
			} else {
				parcela = 5 * salarioMin / 100;
			}
		}
		
		System.out.printf("O valor da parcela é R$%.%n", parcela);
		System.out.print("Está dando certo");
		scan.close();

	}

}
