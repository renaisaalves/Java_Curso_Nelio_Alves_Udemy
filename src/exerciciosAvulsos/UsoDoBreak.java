package exerciciosAvulsos;

public class UsoDoBreak {

	public static void main(String[] args) {
		
		//BREAK
		
		/* Finaliza o loop imediatamente quando é encontrado.
		 * Normalmente usado para interromper um loop quando uma determinada condição é atendida.
		 */
		
		for (int i = 1; i <= 10; i++) {
		    if (i == 5) {
		        break; // Sai do loop quando i for 5
		    }
		    System.out.println(i);
		}
		
		//CONTINUE
		
		/* Pula a iteração atual e continua para a próxima.
		 * Usado quando queremos ignorar uma iteração específica sem sair do loop.
		*/
		
		for (int i = 1; i <= 5; i++) {
		    if (i == 3) {
		        continue; // Pula a iteração quando i for 3
		    }
		    System.out.println(i);
		}
		
		//Ex: Quando i == 3, o continue faz o loop pular essa iteração e ir direto para i == 4.

	}

}
