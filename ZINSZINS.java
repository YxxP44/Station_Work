package station5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ZINSZINS {
    public static void main(String[] args) {
        // Scanner zum Einlesen der Eingaben
        Scanner scanner = new Scanner(System.in);
        
        // Eingabe der Laufzeit, des Anfangskapitals und des Zinssatzes
        System.out.print("Laufzeit (in Jahren) des Sparvertrags: ");
        int laufzeit = scanner.nextInt();
        
        System.out.print("Wie viel Kapital (in Euro) möchten Sie anlegen: ");
        double anlageKapital = scanner.nextDouble();
        
        System.out.print("Zinssatz (in Prozent): ");
        double zinssatz = scanner.nextDouble();
        
        // Berechnung des Endkapitals unter Berücksichtigung des Zinseszinseffekts
        double endkapital = anlageKapital;
        for (int jahr = 1; jahr <= laufzeit; jahr++) {
            endkapital += endkapital * (zinssatz / 100); // Zinsen auf das gesamte Kapital
        }

        // Erstellen eines DecimalFormat-Objekts, um das Format anzupassen
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Ausgabe der Ergebnisse
        System.out.println("\nEingezahltes Kapital: " + df.format(anlageKapital) + " Euro");
        System.out.println("Ausgezahltes Kapital: " + df.format(endkapital) + " Euro");

        // Scanner schließen
        scanner.close();
    }
}
