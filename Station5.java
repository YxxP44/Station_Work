package station5;

import java.util.Scanner;

public class Station5 {
    public static void main(String[] args) {
        // Scanner zum Einlesen der Werte
        Scanner scanner = new Scanner(System.in);
        
        // Eingabe der Start- und Endwerte
        System.out.print("Startwert: ");
        int startwert = scanner.nextInt();
        
        System.out.print("Endwert: ");
        int endwert = scanner.nextInt();
        
        // Schleife, die die Zahlen zwischen dem Start- und Endwert ausgibt
        for (int i = startwert; i <= endwert; i++) {
            System.out.println(i);
        }
        
        // Scanner schließen
        scanner.close();
    }
}
