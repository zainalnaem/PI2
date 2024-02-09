package Übungen;
import java.util.Scanner;
public class Set {

	private byte[] bitmap;

    public Set(int size) {
        bitmap = new byte[size];
    }

    public int add(int value) {
        if (value >= 0 && value < bitmap.length) {
            bitmap[value] = 1;
            return 0;
        } else {
            return -1;
        }
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < bitmap.length; i++) {
            if (bitmap[i] == 1) {
                count++;
            }
        }
        return count;
    }

    public void print() {
        for (int i = 0; i < bitmap.length; i++) {
            if (bitmap[i] == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Geben Sie die Größe der Menge ein: ");
        int size = input.nextInt();
        Set set = new Set(size);

        boolean running = true;
        while (running) {
            System.out.println("Wählen Sie eine Option:");
            System.out.println("1. Element hinzufügen");
            System.out.println("2. Größe der Menge anzeigen");
            System.out.println("3. Elemente der Menge anzeigen");
            System.out.println("4. Programm beenden");

            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Geben Sie das Element ein, das Sie hinzufügen möchten: ");
                    int value = input.nextInt();
                    int result = set.add(value);
                    if (result == -1) {
                        System.out.println("Das Element gehört nicht zur Grundmenge.");
                    }
                    break;
                case 2:
                    int sizeOfSet = set.size();
                    System.out.println("Größe der Menge: " + sizeOfSet);
                    break;
                case 3:
                    set.print();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Ungültige Option.");
            }
        }
    }
}