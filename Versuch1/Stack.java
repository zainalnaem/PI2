package Versuch1;
import java.util.Scanner;

public class Stack {

	private int[] stackArray; // privates Attribut, um das Array zu speichern
	private int stackPointer; // privates Attribut, um den aktuellen Pointer im Stack zu verwalten

	

	// Wenn der Stack voll ist, wird -1 zurückgegeben, sonst wird das Element hinzugefügt und 0 zurückgegeben
	public int push(int value) {
		if (stackPointer == stackArray.length - 1) { // wenn Stack voll
			return -1; // Rückgabe von -1 (Fehler)
		} else {
			stackPointer++; // erhöht den Stackpointer um 1
			stackArray[stackPointer] = value; // fügt das Element hinzu
			return 0; // Rückgabe von 0 (Erfolg)
		}
	}

	// Wenn der Stack leer ist, wird -1 zurückgegeben, sonst wird das oberste Element entfernt und zurückgegeben
	public int pop() {
		if (stackPointer == -1) { // wenn Stack leer
			return -1; // Rückgabe von -1 (Fehler)
		} else {
			int value = stackArray[stackPointer]; // speichert den Wert des obersten Elements
			stackPointer--; // reduziert den Stackpointer um 1
			return value; // Rückgabe des entfernten Elements
		}
	}

	
	public void print() {
		System.out.print("Stack: ");
		for (int i = 0; i <= stackPointer; i++) { // durchläuft alle Elemente bis zum Stackpointer
			System.out.print(stackArray[i] + " "); // gibt das aktuelle Element aus
		}
		System.out.println();
	}
	
	public int getstackPointer() {
		return this.stackPointer;
	}
	
	  public int pushArray(int[] arr) {
		    int len = arr.length;
		    if (stackPointer + len >= stackArray.length) {
		      // Stack hat nicht genug Platz für alle Elemente
		      return -1;
		    } else {
		      for (int i = 0; i < len; i++) {
		        push(arr[i]);
		      }
		      return 0;
		    }
		  }

	// Konstruktor der Klasse, initialisiert die Größe des Stacks und setzt den Pointer auf -1 (Stack ist leer)
		public Stack(int size) {
			stackArray = new int[size];
			stackPointer = -1;
		}
}
		
	
	
	
	
	
	
	
	


