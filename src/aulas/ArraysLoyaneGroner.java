package aulas;

import java.util.Scanner;

public class ArraysLoyaneGroner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] temperatura = new double[7];
		
		for (int i=0; i < temperatura.length; i++) {
			System.out.print("Digite a temperatura do dia " + (i+1) + ": ");
			temperatura[i] = scan.nextDouble();
		}
		
		scan.close();
		
		for (int i=0; i < temperatura.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " é " + temperatura[i]);
		}
		
	    //System.out.println("Temperaturas registradas:");
        //for (double temp : temperatura) {
        //    System.out.println(temp);
        // }

	}

}
