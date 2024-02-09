package Versuch3;

import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Wählen Sie der Datentyp der Liste: 1.Integer/2.Double ");
		int datenTyp = scanner.nextInt();

		

		if (datenTyp == 1) {

			System.out.print("Geben Sie die maximale Arraygröße ein: ");
			int max = scanner.nextInt();
			ArrayGList<Integer> list = new ArrayGList<>(max);

			while (true) {
				System.out.println("Wählen Sie eine Option:");
				System.out.println("1. Länge der Liste anzeigen");
				System.out.println("2. Wert am Ende der Liste einfügen");
				System.out.println("3. Erstes Element der Liste anzeigen");
				System.out.println("4. Erstes Element der Liste entfernen");
				System.out.println("5. Wert in der Liste suchen");
				System.out.println("6. Inhalt der Liste anzeigen");
				System.out.println("7. Programm beenden");

				int choise = scanner.nextInt();
				switch (choise) {
				case 1:
					System.out.println("Die Länge der Liste ist: " + list.getLength());
					break;

				case 2:
					System.out.println("Bitte geben Sie einen Wert ein: ");
					int value = scanner.nextInt();
					int Ergebnis = ((ArrayGList<Integer>) list).insertLast(value);

					if (Ergebnis == 0) {
						System.out.println("Der Wert wurde erfolgreich hinzugefügt.");

					} else {
						System.out.println("Der Wert konnte nicht hinzugefügt werden.");

					}
					break;
				case 3:
					int first = ((ArrayGList<Integer>) list).getFirst();
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
					boolean gefunden = ((ArrayGList<Integer>) list).search(suchendWert);
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
					System.out.println("Ungültige Eingabe");
					break;
				}

			}
		} else if (datenTyp == 2) {

			System.out.print("Geben Sie die maximale Arraygröße ein: ");
			int max = scanner.nextInt();

			ArrayGList <Double> list = new ArrayGList<>(max);

			while (true) {
				System.out.println("Wählen Sie eine Option:");
				System.out.println("1. Länge der Liste anzeigen");
				System.out.println("2. Wert am Ende der Liste einfügen");
				System.out.println("3. Erstes Element der Liste anzeigen");
				System.out.println("4. Erstes Element der Liste entfernen");
				System.out.println("5. Wert in der Liste suchen");
				System.out.println("6. Inhalt der Liste anzeigen");
				System.out.println("7. Programm beenden");

				int choise = scanner.nextInt();
				switch (choise) {
				case 1:
					System.out.println("Die Länge der Liste ist: " + list.getLength());
					break;

				case 2:
					System.out.println("Bitte geben Sie einen Wert ein: ");
					double value = scanner.nextDouble();
					int Ergebnis = ((ArrayGList<Double>) list).insertLast(value);

					if (Ergebnis == 0) {
						System.out.println("Der Wert wurde erfolgreich hinzugefügt.");

					} else {
						System.out.println("Der Wert konnte nicht hinzugefügt werden.");

					}
					break;
				case 3:
					double first = ((ArrayGList<Double>) list).getFirst();
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
					double suchendWert = scanner.nextDouble();
					boolean gefunden = ((ArrayGList<Double>) list).search(suchendWert);
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
					System.out.println("Ungültige Eingabe");
					break;
				}

			}
		} else {
			System.out.println("ungültige Eingabe!");
			return;
		}
	}
}
