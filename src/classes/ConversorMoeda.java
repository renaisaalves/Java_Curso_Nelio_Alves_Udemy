package classes;

public class ConversorMoeda {
	
	public static final int IOF = 6;

	public static double Converter(double cotacao, double valor) {
		double conversion = cotacao * valor;
		double conversionIOF = conversion * IOF / 100;
		return conversion + conversionIOF;
		
	}

}
