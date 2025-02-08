import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		scanner.close();
		
		if (numero > 10) {
			String mensagem = "Número maior que 10";
			System.out.println(mensagem);
		} else {
			System.out.println("Número menor que 10");
		}
		
		
	}

}
