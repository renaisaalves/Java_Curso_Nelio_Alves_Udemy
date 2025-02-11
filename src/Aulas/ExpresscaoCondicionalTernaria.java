package Aulas;

public class ExpresscaoCondicionalTernaria {

	public static void main(String[] args) {
		
		// EXPRESSÃO CONDICIONAL TERNÁRIA
		
		// Estrutura condicional opcional ao "if else" quase se deseja decidir um VALOR com base em uma condição.
		
		int result = (6 > 7)? 1 : 2;
		
		System.out.println(result);
		
		int renaisa = 25;
		int arthur = 18;
		
		String name = (renaisa < arthur)? "Renaisa" : "Arthur";
		System.out.println(name);         // SIM        NÃO

	}

}
