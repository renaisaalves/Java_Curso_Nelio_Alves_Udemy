import java.util.Scanner;

public class ExpressoesComparativas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean value1 = 5 <= 10 && 3 >= 0;
		boolean value2 = !(5 == 10);
		boolean value3 = 4 != 4 || 12 == 9;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		scan.close();

	}

}
