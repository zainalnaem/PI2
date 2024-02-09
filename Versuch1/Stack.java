package Versuch1;
import java.util.Scanner;

public class Stack {

	private int[] stackArray; // privates Attribut, um das Array zu speichern
	private int stackPointer; // privates Attribut, um den aktuellen Pointer im Stack zu verwalten

	

	// Wenn der Stack voll ist, wird -1 zur�ckgegeben, sonst wird das Element hinzugef�gt und 0 zur�ckgegeben
	public int push(int value) {
		if (stackPointer == stackArray.length - 1) { // wenn Stack voll
			return -1; // R�ckgabe von -1 (Fehler)
		} else {
			stackPointer++; // erh�ht den Stackpointer um 1
			stackArray[stackPointer] = value; // f�gt das Element hinzu
			return 0; // R�ckgabe von 0 (Erfolg)
		}
	}

	// Wenn der Stack leer ist, wird -1 zur�ckgegeben, sonst wird das oberste Element entfernt und zur�ckgegeben
	public int pop() {
		if (stackPointer == -1) { // wenn Stack leer
			return -1; // R�ckgabe von -1 (Fehler)
		} else {
			int value = stackArray[stackPointer]; // speichert den Wert des obersten Elements
			stackPointer--; // reduziert den Stackpointer um 1
			return value; // R�ckgabe des entfernten Elements
		}
	}

	
	public void print() {
		System.out.print("Stack: ");
		for (int i = 0; i <= stackPointer; i++) { // durchl�uft alle Elemente bis zum Stackpointer
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
		      // Stack hat nicht genug Platz f�r alle Elemente
		      return -1;
		    } else {
		      for (int i = 0; i < len; i++) {
		        push(arr[i]);
		      }
		      return 0;
		    }
		  }

	// Konstruktor der Klasse, initialisiert die Gr��e des Stacks und setzt den Pointer auf -1 (Stack ist leer)
		public Stack(int size) {
			stackArray = new int[size];
			stackPointer = -1;
		}
}
		
	
	
	
	
	
	
	
	


