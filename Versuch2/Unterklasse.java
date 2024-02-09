package Versuch2;

public class Unterklasse extends mengen {

	// Konstruktor, der zus�tzlich ein Element wert enth�lt
	public Unterklasse(int size, int wert) {
		super(size); // Aufruf des Konstruktors der Oberklasse

		// Hinzuf�gen der Elemente 0 bis wert
		for (int i = 0; i <= wert; i++) {
			add(i);

		}
	}

	// Methode, die true zur�ckliefert, wenn die Menge leer ist
	public boolean istLeer() {
		return size() == 0;

	}

	// Eine erweiterte add-Methode, die zwei Werte unten und oben �bergeben bekommt.
	// Sie pr�ft zun�chst, ob die beiden Werte der Grundmenge GM angeh�ren. Liegt
	// ein Wert oder liegen
	// beide au�erhalb von GM, so soll sofort -1 zur�ckgeliefert werden. Sonst soll
	// die Methode alle Werte
	// e mit unten < e < oben in die Menge einf�gen und eine 0 zur�ckgeben.
	public int erweiterteAdd(int unten, int oben) {

		if (unten < 0 || unten >= mengenArray.length || oben < 0 || oben >= mengenArray.length) {
			return -1; // Liegt einer der Werte au�erhalb der Menge, wird -1 zur�ckgeliefert

		} else {
			for (int i = unten; i <= oben; i++) {
				mengenArray[i] = 1; // alle Werte zwischen unten und oben werden in die Menge eingef�gt
			}
			return 0; // R�ckgabe von 0, wenn das Einf�gen erfolgreich war
		}
	}

}
