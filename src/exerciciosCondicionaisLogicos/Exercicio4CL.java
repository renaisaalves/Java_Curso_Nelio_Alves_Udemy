package exerciciosCondicionaisLogicos;

import java.util.Scanner;

public class Exercicio4CL {

	public static void main(String[] args) {
		
		// 4) Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Hora Inicial: ");
		int horaInicial = scan.nextInt();
		System.out.print("Hora Final: ");
		int horaFinal = scan.nextInt();
		
		int horaTotal;
		if (horaInicial < horaFinal) {
			horaTotal = horaFinal - horaInicial;
		} else {
			horaTotal = (24 - horaInicial) + horaFinal;
		}
		
		System.out.println("Horas de jogo: " + horaTotal + "h");
		
		scan.close();

		
	}

}
