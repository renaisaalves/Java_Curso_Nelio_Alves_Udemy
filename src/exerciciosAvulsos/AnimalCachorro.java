package exerciciosAvulsos;

import java.util.Scanner;
import classes.Cachorro;

public class AnimalCachorro {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Cachorro dog1;
		dog1 = new Cachorro();
		
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
		
		
		System.out.printf("Nome: %s%nRaça: %s%nPorte: %s%nSexo: %s%nIdade: %d%nColoração: %s%n", dog1.nome, dog1.raça, dog1.porte, dog1.sexo, dog1.idade, dog1.corPelagem);
		
		scan.close();
		

	}

}
