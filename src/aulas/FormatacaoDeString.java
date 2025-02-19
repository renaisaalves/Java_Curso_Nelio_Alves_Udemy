package aulas;

import java.util.Scanner;
public class FormatacaoDeString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// FORMATAÇÃO DE STRING
		
		String name = scan.nextLine();
		
		String s1 = name.toLowerCase();
		String s2 = name.toUpperCase();
		String s3 = name.trim();
		String s4 = name.substring(2);
		String s5 = name.substring(2, 6);
		String s6 = name.replace('a', 'x');
		String s7 = name.replace("isa", "xyz");
		int i = name.indexOf("e");
		int j = name.lastIndexOf("E");
		
		System.out.println("original: • " + name + "•");
		System.out.println("toLowerCase: • " + s1 + "•");
		System.out.println("toUpperCase: • " + s2 + "•");
		System.out.println("trim:•" + s3 + "  •   ");
		System.out.println("substring (inicio): • " + s4 + "•");
		System.out.println("substring (inicio, fim): • " + s5 + "•");
		System.out.println("Replace: • " + s6 + "•");
		System.out.println("Replace: • " + s7 + "•");
		System.out.println("indexOf: • " + i + "•");
		System.out.println("lastIndexOf: • " + j + "•");
		System.out.println(name.toUpperCase());
		
		scan.close();
	}

}


/* FORMATAR
 * Letra minúscula: toLowerCase()
 * Letra maiúscula: toUpperCase()
 * Remover espaços: trim()
 * 
 * RECORTAR
 * substring(inicio)
 * substring(inicio, fim)
 * 
 * SUBSTITUIR
 * Replace(char, char)
 * Replace(string, string)
 * 
 * BUSCAR
 * Primeira ocorrências a palavra "e" teve: IndexOf
 * Última ocorrência da palavra "e": LastIndexOf
 * 
 * CORTAR
 * Recortar uma string: str.split(" ")
 * */
 