package exercicios;

import java.util.Scanner;

public class FuncionamentoDoScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// DICAS DE COMO USAR O SCANNER PARA RECEBER ENTRADA DE DADOS
		
		// Quando você quiser criar muitas variáveis de um mesmo tipo, você pode separá-las por vírgula (como no exemplo abaixo);
		
		String s1, s2, s3;
		
		int idade = scan.nextInt();
		s1 = scan.nextLine();
		s2 = scan.nextLine();
		s3 = scan.nextLine();
		
		// O nextLine() permite que a variável receba várias palavras ao mesmo tempo, diferente de next (que só pega 1 palavra). A variável só vai deixar de receber as palavras quando o usuário apertar ENTER. 
		
		System.out.println("Dados digitados: ");
		System.out.println(idade);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// Além disso, existe um problema quando o tipo de dado inserido vêm antes do tipo String e não é do tipo String. 

		
		scan.close();

	}

}
