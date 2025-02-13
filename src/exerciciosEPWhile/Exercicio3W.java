package exerciciosEPWhile;

import java.util.Scanner;

public class Exercicio3W {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		// preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		// combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		// 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		// 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		// será encerrado quando o código informado for o número 4. Deve ser escrito
		// mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		// tipo de combustível, conforme exemplo.

		System.out.print(
				"TABELA DE COMBUSTÍVEIS\n[1] Álcool\n[2] Gasolina\n[3] Diesel\n[4] Cancelar\n\nSelecione um número: ");

		int quantAlcool = 0;
		int quantGasolina = 0;
		int quantDiesel = 0;
		int combustivel = scan.nextInt();

		while (combustivel != 4) {
			while (combustivel > 4 || combustivel <= 0) {
				System.out.print("Código inválido. Insira novamente: ");
				combustivel = scan.nextInt();
			}
			while (combustivel > 0 && combustivel < 4) {
				if (combustivel == 1) {
					quantAlcool += 1;
				} else if (combustivel == 2) {
					quantGasolina += 1;
				} else {
					quantDiesel += 1;
				}
				System.out.print("Deseja repetir? Insira novamente o tipo de combustível: ");
				combustivel = scan.nextInt();
			}
		}

		System.out.println("\nMUITO OBRIGADO!\n\nQuantidade de clientes que abasteceram cada tipo de combustível:");
		System.out.printf("Álcool: %d%nGasolina: %d%nDiesel: %d%n", quantAlcool, quantGasolina, quantDiesel);

		scan.close();

	}

}
