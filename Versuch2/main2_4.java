package Versuch2;

import java.util.Scanner;

public class main2_4 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie die L�nge des Arrays ein:");
		int size = scanner.nextInt();
		
		mengen Mengen = new mengen (size);
		Mengen = null;
	
		
		
	 
		
		while(true) {
			System.out.println("Welche Methode m�chten Sie aufrufen");
			System.out.println("1: Add-Methode");
			System.out.println("2: Size-Methode");
			System.out.println("3: Print-Methode");
			System.out.println("4: Das Programm beenden");
			try {
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
			System.out.println("Geben Sie den Wert ein, den Sie hinzuf�gen m�chten:");
			int wert = scanner.nextInt();
			int ergebnis = Mengen.add(wert);
			
			if (ergebnis ==0) {
				System.out.println("Das Element wurde hinzugef�gt.");
			} else {
				System.out.println("Das Element konnte nicht hinzugef�gt werden.");
			}
			break;
			case 2:
			 
				System.out.println("Die Gr��e des Menge betr�gt: " + Mengen.size());
				
				break;
			case 3:
			System.out.println("Die Elemente der Menge sind: ");
			Mengen.print();
			break;
			case 4:
				 System.out.println("Programm beendet.");
				 scanner.close();
                 return;
		
			default:
					 System.out.println("Ung�ltige Eingabe");
					 break;
			
			}
			
			
		}
	
		
		
		
		
		
		catch(NullPointerException e) {
			System.out.println("\"Fehler: Nullzeiger-Zugriff");
		}
			
		System.out.println("Programm laeuft weiter");

	}

}
}
