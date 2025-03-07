package Versuch3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geben Sie die maximale Arraygr��e ein: ");
		int max = scanner.nextInt();

		ArrayIntegerList list = new ArrayIntegerList(max);

		while (true) {
			System.out.println("W�hlen Sie eine Option:");
			System.out.println("1. L�nge der Liste anzeigen");
			System.out.println("2. Wert am Ende der Liste einf�gen");
			System.out.println("3. Erstes Element der Liste anzeigen");
			System.out.println("4. Erstes Element der Liste entfernen");
			System.out.println("5. Wert in der Liste suchen");
			System.out.println("6. Inhalt der Liste anzeigen");
			System.out.println("7. Programm beenden");

			int option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Die L�nge der Liste ist: " + list.getLength());
				break;

			case 2:
				System.out.println("Bitte geben Sie einen Wert ein: ");
				int value = scanner.nextInt();
				int Ergebnis = list.insertLast(value);

				if (Ergebnis == 0) {
					System.out.println("Der Wert wurde erfolgreich hinzugef�gt.");

				} else {
					System.out.println("Der Wert konnte nicht hinzugef�gt werden.");

				}
				break;
			case 3:
				int first = list.getFirst();
				if (first == -9999) {
					System.out.println("Die Liste ist leer!");
				} else {
					System.out.println("Erstes Element der Liste ist: " + first);
				}
				break;
			case 4:
				int ergebnis = list.deleteFirst();
				if (ergebnis == 0) {
					System.out.println("Erstes Element wurde erfolgreich entfernt");
				} else {
					System.out.println("Es gibt keinne Elemente zu entfernen!");

				}
				break;
			case 5:
				System.out.println("Geben Sie einen zu suchenden Wert ein");
				int suchendWert = scanner.nextInt();
				boolean gefunden = list.search(suchendWert);
				if (gefunden) {
					System.out.println("Der Wert " + suchendWert + " wurde in der Liste gefunden.");

				} else {
					System.out.println("Der Wert " + suchendWert + " wurde in der Liste nicht gefunden.");
				}
				break;
			case 6:
				System.out.println("Der Inhalt der Liste ist: ");
				list.print();
				break;
			case 7:
				System.out.println("Das Programm wird beendet.");
				scanner.close();
				return;
			default:
				System.out.println("Ung�ltige Eingabe");
				break;
			}

		}
	}
}
