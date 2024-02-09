package Versuch1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welche Aufgabe möchten Sie ausführen?");
		System.out.println("1. Aufgabe 1.1");
		System.out.println("2. Aufgabe 1.2");
		int choice1 = scanner.nextInt();
		switch (choice1) {

		case 1:
			// Aufgabe 1.1

			System.out.print("Geben Sie die Stackgröße ein: ");
			int size = scanner.nextInt();

			Stack stack = new Stack(size);

			// while-schleife, bis der Benutzer das Programm beenden möchte
			while (true) {

				System.out.println("Wählen Sie eine Methode:");
				System.out.println(" push  (1):  um ein Element auf den Stack zu legen");
				System.out.println(" pop   (2):  um ein Element vom Stack zu entfernen");
				System.out.println(" print (3):  um den aktuellen Stackinhalt auszugeben");
				System.out.println(" oder  (4):  um das Programm zu beenden");

				int choice = scanner.nextInt();

				if (choice == 1) {

					System.out.print("Geben Sie den Wert ein, der auf dem Stack abgelegt werden soll: ");
					int value = scanner.nextInt();
					int result = stack.push(value);
					if (result == -1) {
						System.out.println("Stack ist voll.");
					}
				} else if (choice == 2) {
					int value = stack.pop();
					if (value == -1) {
						System.out.println("Stack ist leer.");
					} else {
						System.out.println("Gelesener Wert: " + value);
					}
				} else if (choice == 3) {
					System.out.println("Aktueller Stack-Inhalt:");
					stack.print();
				} else if (choice == 4) {
					System.out.println("Programm beendet.");
					break;
				} else {
					System.out.println("Ungültige Eingabe.");
				}
			}

			break;
		case 2: // Aufgabe 1.2

			UnterKlasse Stack = new UnterKlasse(6, 10);

			while (true) {

				System.out.println("Wählen Sie eine Methode:");
				System.out.println("-push        (1):  um ein Element auf den Stack zu legen");
				System.out.println("-pop         (2):  um ein Element vom Stack zu entfernen");
				System.out.println("-print       (3):  um den aktuellen Stackinhalt auszugeben");
				System.out.println("-Array Push  (4):  um ein Array auf den Stack zu legen");
				System.out.println(
						"-Stack_leer? (5): um zu wissen, ob der Stack voll oder leer ist \n  (true bedeutet leer)(false bedeutet nicht leer)");
				System.out.println("-oder        (6):  um das Programm zu beenden");

				int choice = scanner.nextInt();

				if (choice == 1) {

					System.out.print("Geben Sie den Wert ein, der auf dem Stack abgelegt werden soll: ");
					int value = scanner.nextInt();
					int result = Stack.push(value);
					if (result == -1) {
						System.out.println("Stack ist voll.");
					}
				} else if (choice == 2) {
					int value = Stack.pop();
					if (value == -1) {
						System.out.println("Stack ist leer.");
					} else {
						System.out.println("Gelesener Wert: " + value);
					}
				} else if (choice == 3) {
					System.out.println("Aktueller Stack-Inhalt:");
					Stack.print();
				} else if (choice == 4) {

					int arrSize = 0;
					System.out.println("Geben Sie Array Länge:");
					while (true) {
						try {
							arrSize = scanner.nextInt();
							break;
						} catch (InputMismatchException error) {
							System.out.println("Sie haben eine ungültige Eingabe eingegeben, versuchen Sie nochmal");
							scanner.nextLine();
						}
					}

					int arr[] = new int[arrSize];
					System.out.println(
							"Geben Sie nun (" + arrSize + ") Werte ein, die auf dem Stack abgelegt werden soll: ");
					for (int i = 0; i < arrSize; i++) {

						while (true) {
							try {
								arr[i] = scanner.nextInt();
								break;
							} catch (InputMismatchException error) {
								System.out
										.println("Sie haben eine ungültige Eingabe eingegeben, versuchen Sie nochmal");
								scanner.nextLine();
							}
						}
					}
					Stack.pushArray(arr);

				} else if (choice == 5) {
					boolean a = Stack.isEmpty();

					if (a == true) {
						System.out.println("true");
					} else {
						System.out.println("false");

					}

				} else if (choice == 6) {
					System.out.println("Programm beendet.");
					break;

				}

				else {
					System.out.println("Ungültige Eingabe.");
				}
			}

		}
	}
}

	
