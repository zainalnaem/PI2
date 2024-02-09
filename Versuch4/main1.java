package Versuch4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("daten.txt");
		BufferedReader bufReader = new BufferedReader(reader);
		 Scanner scanner = new Scanner(reader);
		 int Datensätze_Anzahl = Integer.parseInt(scanner.nextLine());
		 
		// Erzeugung eines Arrays entsprechender Länge
         Mensch[] menschen = new Mensch[Datensätze_Anzahl];

         // Schrittweises Einlesen der Datensätze und Erzeugung der Mensch-Objekte
         for (int i = 0; i < Datensätze_Anzahl; i++) {
             String name = scanner.nextLine();
             double groesse = Double.parseDouble(scanner.nextLine());
             int alter = Integer.parseInt(scanner.nextLine());

             menschen[i] = new Mensch(name, groesse, alter);
         }

        
         // Ausgabe aller Datensätze
         for (Mensch mensch : menschen) {
             mensch.Ausgabe();
        }
		
//       Serialisierte Ausgabe des Arrays in eine Datei "daten2"
         FileWriter writer = new FileWriter("daten4");
         BufferedWriter bufWriter = new BufferedWriter(writer);
         bufWriter.write(menschen.toString());
         writer.close();

         // Serialisiertes Einlesen des Inhalts von "daten2" in einen zweiten Array
         FileReader reader2 = new FileReader("daten4.txt");
         BufferedReader bufReader2 = new BufferedReader(reader2);
        
       //  Mensch[] secondMenschen = (Mensch[]) reader2.read();
       //  reader2.close();

         // Ausgabe des zweiten Arrays
      //   for (Mensch mensch : secondMenschen) {
       //  mensch.Ausgabe();
       //}
         
	 // reader.close();
		} catch (IOException e) {
            e.printStackTrace();
        }

	}

}
