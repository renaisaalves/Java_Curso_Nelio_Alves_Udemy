package exercicios;

import java.util.Scanner;

public class FuncionamentoDoScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// DICAS DE COMO USAR O SCANNER PARA RECEBER ENTRADA DE DADOS
		
		// Quando você quiser criar muitas variáveis de um mesmo tipo, você pode separá-las por vírgula (como no exemplo abaixo);
		
		String s1, s2, s3;
		
		int idade = scan.nextInt();
		scan.nextLine(); // extra para não consumir a variável s1
		s1 = scan.nextLine();
		s2 = scan.nextLine();
		s3 = scan.nextLine();
		
		// O nextLine() permite que a variável receba várias palavras ao mesmo tempo, diferente de next (que só pega 1 palavra). A variável só vai deixar de receber as palavras quando o usuário apertar ENTER. 
		
		System.out.println("Dados digitados: ");
		System.out.println(idade);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// Além disso, existe um problema quando o tipo de dado inserido vêm antes do tipo String e não é do tipo String. Perceba que no exemplo acima, a primeira variável declarada é do tipo int. Ao inserir o número, o enter consome a linha que é ocupada pela primeira variável do tipo String (s1). A solução então seria inserir um next extra. 
		
		scan.close();

	}

}
