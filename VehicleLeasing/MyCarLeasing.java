import java.util.Arrays;
import java.util.Comparator;

public class MyCarLeasing {
    public static void main(String[] args) throws InterruptedException {
        // Δημιουργία πίνακα 5 θέσεων τύπου CarLeasing
        CarLeasing[] carLeasings = new CarLeasing[5];

        // Αρχικοποίηση του πίνακα με δεδομένα
        carLeasings[0] = new FullTimeLeasing("YZE6418", 1200.0);
        carLeasings[1] = new FullTimeLeasing("AIX2334", 1000.0);
        carLeasings[2] = new PartTimeLeasing("XAP5689", 15, 50);
        carLeasings[3] = new FullTimeLeasing("ZAB1262", 1500.0);
        carLeasings[4] = new PartTimeLeasing("INB9080", 20, 40);

        // Ταξινόμηση του πίνακα βάσει της χρέωσης μίσθωσης
        Arrays.sort(carLeasings, new Comparator<CarLeasing>() {
            @Override
            public int compare(CarLeasing car1, CarLeasing car2) {
                return Double.compare(car1.getLeasingCost(), car2.getLeasingCost());
            }
        });

        // Εμφάνιση κεφαλίδας πίνακα σε κουτάκια
        printRowSeparator();
        System.out.printf("| %-20s | %-20s |\n", "ARITHMOS KYKLOFORIAS", "XREWSH MISTHWSIS (€)");
        printRowSeparator();

        // Εμφάνιση δεδομένων σε κουτάκια
        for (CarLeasing car : carLeasings) {
            System.out.printf("| %-20s | %-20.2f |\n", car.toString().split(" -> ")[0].split(": ")[1],
                    car.getLeasingCost());
            printRowSeparator();
        }
    }

    /**
     * Εκτυπώνει τη διαχωριστική γραμμή του πίνακα
     */
    private static void printRowSeparator() {
        System.out.println("+----------------------+----------------------+");
    }
}
