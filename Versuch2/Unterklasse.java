package Versuch2;

public class Unterklasse extends mengen {

	// Konstruktor, der zusätzlich ein Element wert enthält
	public Unterklasse(int size, int wert) {
		super(size); // Aufruf des Konstruktors der Oberklasse

		// Hinzufügen der Elemente 0 bis wert
		for (int i = 0; i <= wert; i++) {
			add(i);

		}
	}

	// Methode, die true zurückliefert, wenn die Menge leer ist
	public boolean istLeer() {
		return size() == 0;

	}

	// Eine erweiterte add-Methode, die zwei Werte unten und oben übergeben bekommt.
	// Sie prüft zunächst, ob die beiden Werte der Grundmenge GM angehören. Liegt
	// ein Wert oder liegen
	// beide außerhalb von GM, so soll sofort -1 zurückgeliefert werden. Sonst soll
	// die Methode alle Werte
	// e mit unten < e < oben in die Menge einfügen und eine 0 zurückgeben.
	public int erweiterteAdd(int unten, int oben) {

		if (unten < 0 || unten >= mengenArray.length || oben < 0 || oben >= mengenArray.length) {
			return -1; // Liegt einer der Werte außerhalb der Menge, wird -1 zurückgeliefert

		} else {
			for (int i = unten; i <= oben; i++) {
				mengenArray[i] = 1; // alle Werte zwischen unten und oben werden in die Menge eingefügt
			}
			return 0; // Rückgabe von 0, wenn das Einfügen erfolgreich war
		}
	}

}
