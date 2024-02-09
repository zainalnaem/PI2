package Versuch4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		 try {
	            // Einlesen der Anzahl der Datens�tze aus der Datei
	            File inputFile = new File("daten.txt");
	            Scanner scanner = new Scanner(inputFile);
	            int Datens�tze_Anzahl = Integer.parseInt(scanner.nextLine());

	            // Erzeugung eines Arrays entsprechender L�nge
	            Mensch[] menschen = new Mensch[Datens�tze_Anzahl];

	            // Schrittweises Einlesen der Datens�tze und Erzeugung der Mensch-Objekte
	            for (int i = 0; i < Datens�tze_Anzahl; i++) {
	                String name = scanner.nextLine();
	                double groesse = Double.parseDouble(scanner.nextLine());
	                int alter = Integer.parseInt(scanner.nextLine());

	                menschen[i] = new Mensch(name, groesse, alter);
	            }

	            scanner.close();

	            // Ausgabe aller Datens�tze
	            for (Mensch mensch : menschen) {
	                mensch.Ausgabe();
	            }

       //     Serialisierte Ausgabe des Arrays in eine Datei "daten2"
	            FileOutputStream fileOutputStream = new FileOutputStream("daten2");
	            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	            objectOutputStream.writeObject(menschen);
	            objectOutputStream.toString();
	            objectOutputStream.close();

	            // Serialisiertes Einlesen des Inhalts von "daten2" in einen zweiten Array
	        FileInputStream fileInputStream = new FileInputStream("daten2");
          ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	        Mensch[] secondMenschen = (Mensch[]) objectInputStream.readObject();
	         objectInputStream.close();

	            // Ausgabe des zweiten Arrays
	            for (Mensch mensch : secondMenschen) {
	             mensch.Ausgabe();
	          }

	         } catch (IOException  | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}