

public class SignificadoCasting {
	
	public static void main(String[] args) {
		
		int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		/* O QUE É CASTING? 
		  Casting significa "enfatizar", ou seja, é quando você quer afirmar ao compilador que deseja um determinado tipo, mesmo não sendo o recomendado. No exemplo abaixo, foi criado 2 variáveis de tipos diferentes: flutuante e inteiro. A variável flutuante recebeu um valor 5.0, enquanto que a variável do tipo inteiro receberá a variável do tipo flutuante. Como os tipos são diferentes, o compilador apontou um erro. Porém, como o objetivo é afirmar ao compilador que você deseja receber o tipo inteiro (e não o flutuante), você precisa deixar explícito entre parênteses o tipo que você quer. No caso, foi (int).
		 */
		
		double a = 5.0;
		int b = (int) a;
		
		System.out.println(b);
		
	}

}
