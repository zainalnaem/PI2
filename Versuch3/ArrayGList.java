package Versuch3;

public class ArrayGList<T> implements GList<T> {
	private T[] array; // Erzeugen des Arrays mit der angegebenen maximalen Größe
	private int listLaenge;

	public ArrayGList(int max) {
		this.array = (T[]) new Object[max];
		listLaenge = 0; // Initialisieren der Länge mit 0
	}

	@Override
	public int getLength() {

		return listLaenge;

	}

	@Override
	public int insertLast(T value) {
		if (listLaenge < array.length) { // Überprüfen, ob die Liste noch Platz für weitere Elemente hat
			array[listLaenge] = value; // Wert am Ende der Liste einfügen
			listLaenge++; // Länge erhöhen
			return 0; // Erfolgreich eingefügt
		}
		return -1; // Array ist voll
	}

	@Override
	public T getFirst() {
		if (listLaenge > 0) {// Überprüfen, ob die Liste nicht leer ist
			return array[0];// Erstes Element der Liste zurückgeben
		}
		return null; // Liste ist leer
	}

	@Override
	public int deleteFirst() {
		if (listLaenge > 0) { // Überprüfen, ob die Liste nicht leer ist
			for (int i = 0; i < listLaenge - 1; i++) {
				array[i] = array[i + 1];  // Elemente im Array nach vorne verschieben, um das erste Element zu löschen
			}
			listLaenge--; // Länge der Liste verringern
			return 0; // Erfolgreich entfernt
		}
		return -1; // Liste ist leer
	}

	@Override
	public boolean search(T value) {
		for (int i = 0; i < listLaenge; i++) {
			if (array[i].equals(value)) { // Überprüfen, ob das Element in der Liste vorhanden ist
				return true; // Wert gefunden
			}
		}
		return false; // Wert nicht gefunden
	}

	@Override
	public void print() {
		if (listLaenge > 0) { // Überprüfen, ob die Liste nicht leer ist
			System.out.print("{");
			for (int i = 0; i < listLaenge; i++) {

				System.out.print(" " + array[i]);

			}
			System.out.println("}");
		} else {
			System.out.println("Die Liste ist leer.");
		}
	}

}