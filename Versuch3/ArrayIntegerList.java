package Versuch3;

public class ArrayIntegerList implements IntegerList {

	private int[] array;
	private int listLaenge;

	public ArrayIntegerList(int max) {
		this.array = new int[max];
		listLaenge = 0;
	}

	@Override
	public int getLength() {

		return listLaenge;

	}

	@Override
	public int insertLast(int value) {
		if (listLaenge < array.length) {
			array[listLaenge] = value;
			listLaenge++;
			return 0; // Erfolgreich eingefügt
		}
		return -1; // Array ist voll
	}

	@Override
	public int getFirst() {
		if (listLaenge > 0) {
			return array[0];
		}
		return -9999; // Liste ist leer
	}

	@Override
	public int deleteFirst() {
		if (listLaenge > 0) {
			for (int i = 0; i < listLaenge - 1; i++) {
				array[i] = array[i + 1];
			}
			listLaenge--;
			return 0; // Erfolgreich entfernt
		}
		return -1; // Liste ist leer
	}

	@Override
	public boolean search(int value) {
		for (int i = 0; i < listLaenge; i++) {
			if (array[i] == value) {
				return true; // Wert gefunden
			}
		}
		return false; // Wert nicht gefunden
	}

	@Override
	public void print() {
		if (listLaenge > 0) {
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
