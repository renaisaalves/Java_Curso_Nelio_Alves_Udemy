import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		scan.close();
		
		if (numero > 10) {
			String mensagem = "Número maior que 10";
			System.out.println(mensagem);
		} else {
			System.out.println("Número menor que 10");
		}
		
	}

}
