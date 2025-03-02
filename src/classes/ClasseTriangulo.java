package classes;

public class ClasseTriangulo {
	//Atributos
	public double a;
	public double b;
	public double c;
	//Funções (Métodos)
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
