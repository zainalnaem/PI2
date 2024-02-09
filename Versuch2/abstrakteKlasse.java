package Versuch2;

public abstract class abstrakteKlasse {

//	Abstrakte Methode
	public abstract void Mengenkomplement();

//Array f�r Bitmap-Darstellung der Menge definieren
	public byte[] mengenArray;
	public int size;

	// Konstruktor
	public abstrakteKlasse(int size) {
		// Erzeugen des Arrays mit der gew�nschten Gr��e
		this.mengenArray = new byte[size];

		// Initialisieren des Arrays mit Nullen
		for (int i = 0; i < size; i++) {
			this.mengenArray[i] = 0;
		}
	}

	// Methode zum Einf�gen eines Elements in die Menge
	public int add(int wert) {

		if (wert >= 0 && wert < this.mengenArray.length) {
			if (mengenArray[wert] == 0) {
				mengenArray[wert] = 1;
				return 0; // Gib 0 zur�ck, um anzuzeigen, dass das Element erfolgreich hinzugef�gt wurde
			} else {
				return -1; // gib -1 zur�ck, um anzuzeigen, dass das Element bereits in der Menge vorhanden
							// ist

			}
		} else {
			return -1; // Wenn wert nicht im g�ltigen Bereich liegt, gib -1 zur�ck
		}

	}

	// Methode zur Bestimmung der Gr��e der Menge
	public int size() {
		int Groe�e = 0;
		for (int i = 0; i < mengenArray.length; i++) {
			if (mengenArray[i] != 0) {
				Groe�e++;
			}

		}
		return Groe�e;
	}

	// Methode zum Ausgeben der Elemente der Menge
	public void print() {
		System.out.print("{");
		for (int i = 0; i < mengenArray.length; i++) {
			if (mengenArray[i] != 0) {
				System.out.print(" " + i);
			}
		}
		System.out.println("}");
	}

	public boolean inhalt(int element) {
		for (int i = 0; i < size; i++) {
			if (mengenArray[i] == element) {
				return true;
			}
		}
		return false;
	}

}