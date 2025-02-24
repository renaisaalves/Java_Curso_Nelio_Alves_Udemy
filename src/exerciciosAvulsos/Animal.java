package exerciciosAvulsos;

import java.util.Scanner;
import classes.classeCachorro;

public class Animal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		classeCachorro dog1;
		dog1 = new classeCachorro();
		
		System.out.print("Nome: ");
		dog1.nome = scan.nextLine();
		System.out.print("Raça: ");
		dog1.raça = scan.nextLine();
		System.out.print("Porte: ");
		dog1.porte = scan.next();
		System.out.print("Sexo: ");
		dog1.sexo = scan.next().charAt(0);
		System.out.print("Idade: ");
		dog1.idade = scan.nextInt();
		System.out.print("Cor (tipo de pelagem): ");
		dog1.corPelagem = scan.next();
		
		
		System.out.println("\nNome: " + dog1.nome + "\nRaça: " + dog1.raça + "\nPorte: " + dog1.porte + "\nSexo: " + dog1.sexo + "\nIdade: " + dog1.idade + "\nTipo de pelagem (cor): " + dog1.corPelagem);
		
		scan.close();
		

	}

}
