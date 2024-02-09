package Versuch1;

public class UnterKlasse extends Stack {
	
	// Konstruktor, füllt den Stack mit den Werten wert, wert+1, wert+2, ...
	  public UnterKlasse(int size, int wert) {
	    super(size);
	    for (int i = 0; i < size; i++) {
	      push(wert + i);
	    }
	  }
	// prüft, ob der Stack leer ist
	  public boolean isEmpty() {
	    return super.getstackPointer() == -1;
	  }
	  
	  // erweiterte push-Methode, um ein Array von Elementen hinzuzufügen
	  public int pushArray(int[] arr) {
	    return super.pushArray(arr);
	  }
	}