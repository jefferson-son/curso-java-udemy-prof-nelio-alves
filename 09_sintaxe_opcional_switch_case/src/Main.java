import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String day;

		switch (x) {
		case 1:
			day = "Domingo";
			break;
		case 2:
			day = "Segunda-feira";
			break;
		case 3:
			day = "Terça-feira";
			break;
		case 4:
			day = "Quarta-feira";
			break;
		case 5:
			day = "Quinta-feira";
			break;
		case 6:
			day = "Sexta-feira";
			break;
		case 7:
			day = "Sábado";
			break;
		default:
			day = "Valor inválido";
			break;
		}

		System.out.println("Dia da semana: " + day);
		sc.close();
	}

}
