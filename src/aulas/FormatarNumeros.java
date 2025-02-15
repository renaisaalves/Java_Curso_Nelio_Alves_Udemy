package aulas;
import java.util.Locale;

public class FormatarNumeros {
	
	public static void main(String[] args) {
		
		double x = 10.35784;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x); // %.2f determina a quantidade de casas decimais. Por exemplo: %.2f significa 2 casas decimais após a vírgula (10,36)
		System.out.printf("%.4f%n", x); // %n significa quebra de linha
		Locale.setDefault(Locale.US); // Classe específica para configurar pontuação (formato do EUA)
		System.out.printf("%.2f%n", x); // Observe que agora ao invés da vírgula, os números estão sendo separados por ponto
		
		String name = "Renaisa";
		double a = 1.60;
		double p = 53.8;
		System.out.println(name + " tem " + a + " de altura e pesa " + p + " quilos");
		System.out.printf("%s tem %.2f de altura e pesa %.1f quilos %n", name, a, p); //%s = texto; %d = inteiro; %f = ponto flutuante;
		
		int idade = 25;
		double renda = 1125.69;
		System.out.printf("%s tem %d anos e ganha R$%.2f reais", name, idade, renda);
	}

}
