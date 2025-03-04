package classes;

public class Retangulo {
	
	public double width;
	public double height;
	
	public double area() {
		double a = width * height;
		return a;
	}
	
	public double perimeter() {
		double p = 2 * (width * height);
		return p;
	}
	
	public double diagonal() {
		
		double d = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return d;
		
	}
	
	public String toString(String result) {
		return "Altura: %.1f%n" + area() + "Largura: %1.f%n" + perimeter() + "Diagonal: %1.f%n" + diagonal();
	}

}
