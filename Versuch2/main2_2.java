package Versuch2;

import java.util.Scanner;

public class main2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Unterklasse unterklasse = new Unterklasse(10, 2);

		while (true) {
			System.out.println("Welche Methode m�chten Sie aufrufen");
			System.out.println("1: Add-Methode");
			System.out.println("2: Size-Methode");
			System.out.println("3: Print-Methode");
			System.out.println("4: Menge ist leer?");
			System.out.println("5: erweiterteAdd-Methode");
			System.out.println("6: Das Programm beenden");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Geben Sie den Wert ein, den Sie hinzuf�gen m�chten:");
				int wert = scanner.nextInt();
				int ergebnis = unterklasse.add(wert);

				if (ergebnis == 0) {
					System.out.println("Das Element wurde hinzugef�gt.");
				} else {
					System.out.println("Das Element konnte nicht hinzugef�gt werden.");
				}
				break;
			case 2:

				System.out.println("Die Gr��e des Menge betr�gt: " + unterklasse.size());

				break;
			case 3:
				System.out.println("Die Elemente der Menge sind: ");
				unterklasse.print();
				break;

			case 4:
				System.out.println("(" + unterklasse.istLeer() + ")");
				break;
			case 5:
				System.out.println("Geben Sie einen unteren wert an: ");
				int unten = scanner.nextInt();
				System.out.println("Geben Sie einen oberen Wert an: ");
				int oben = scanner.nextInt();
				int Ergebnis = unterklasse.erweiterteAdd(unten, oben);
				if (Ergebnis == -1) {
					System.out.println("Das Element konnte nicht hinzugef�gt werden.");
				} else {
					System.out.println("Die Elemente wurden erfolgreich hinzugef�gt");
				}
				break;

			case 6:
				System.out.println("Programm beendet.");
				scanner.close();
				return;

			default:
				System.out.println("Ung�ltige Eingabe");
				break;

			}

		}
	}
}