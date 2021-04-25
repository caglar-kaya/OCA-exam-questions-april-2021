package solutions_026_050;

import java.util.Scanner;

class Game {
	public static void menu() {
		System.out.println("\n1. Left 2. Right 0. Stop");
	}
}

public class S_044 {

	public static void main(String[] args) {

		int option;
		Scanner scanner = new Scanner(System.in);
		do {
			Game.menu();
			System.out.print("Enter your option: ");
			option = scanner.nextInt();
			System.out.println("Your option: " + option);
		} while (option != 0);
	}

}
