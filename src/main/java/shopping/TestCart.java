package shopping;

import java.util.Scanner;

public class TestCart {

	public static void main(String[] args) {
		// IndexClass index = new IndexClass();
		IndexClass.display();
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		Retreval.conditional(choice);

	}

}
