package exercicios;

import java.util.Scanner;

public class EntradaDeDados {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String name = scan.next();
		System.out.println(name);
		
		System.out.print("Digite um número: ");
		int number = scan.nextInt();
		System.out.println(number);
		
		//ENTRADA DE DADOS DO TIPO DOUBLE/FLOAT
		
		// Por padrão, o compilador só vai aceitar a vírgula (por causa da configuração do meu PC ser PT/BR. Caso tenha interesse em usar o ponto ao invés de vírgula, terá que importar a Classe Locale.setDefault(Locale US); antes do Scanner. Caso contrário, dará erro de sintaxe. //
		
		System.out.print("Digite sua altura: "); 
		double altura = scan.nextDouble();
		System.out.printf("%.2f%n", altura);
		
		//PARA LER UM CARACTERE 
		
		// O char é diferente dos outros, pois além do next(), você também precisará chamar um outro método chamado .charAt(0). Esse método vai escolher 1 caracter dentre as palavras digitadas no texto. Por exemplo: se eu digitar a palavra RENAISA e colocar o número 5, vou obter como resposta "S"
		
		System.out.println("Digite uma palavra: ");
		char palavra = scan.next().charAt(5);
		System.out.println("Você digitou: " + palavra);
		
		//COMO LER VÁRIOS DADOS NA MESMA LINHA
		
		//Você digita tudo na mesma linha, seguindo a mesma ordem do tipo de entrada. Se der enter antes ou não digitar todas as variáveis, vai dar erro.
		
		String a;
		int b;
		double c;
		char d;
		
		a = scan.next();
		b = scan.nextInt();
		c = scan.nextDouble();
		d = scan.next().charAt(2);
		
		System.out.println("Dados digitados:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		scan.close();
		}
	}