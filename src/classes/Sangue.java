package classes;

public class Sangue {
	
	public String bloodType;

	public String compatibilidade() {
		if (bloodType.equals("O")) {
			return "Doador Universal";
		} else if (bloodType.equals("A")) {
			return "Pode doar para pessoas do tipo A e O";
		} else if (bloodType.equals("B")) {
			return "Pode doar para pessoas do tipo B e O";
		} else if (bloodType.equals("AB")){
			return "Pode doar para pessoas do tipo A, B e AB";
		} else {
			return "Tipo inválido.";
		}
	}
	
	public String compatibilidadeSwitchCase() {
		switch (bloodType) {
		case "O":
			return "Doador Universal";
		case "A":
			return "Pode doar para pessoas do tipo A e O";
		case "B":
			return "Pode doar para pessoas do tipo B e O";
		case "AB":
			return "Pode doar para pessoas do tipo A, B e AB";
		default:
			return "Tipo sanguíneo inválido!";	
		}
	}
	
	
}

//.equals() vai comparar as Strings. Se elas forem iguais, o resultado será V, senão, será F
