public class PartTimeLeasing extends CarLeasing {
    // Ιδιωτικά πεδία
    private int leasing_hours; // Ώρες μίσθωσης
    private double cost_per_hour; // Χρέωση ανά ώρα

    /**
     * Κατασκευαστής που δέχεται τον αριθμό κυκλοφορίας, τις ώρες μίσθωσης και τη χρέωση ανά ώρα
     * @param car_id Ο αριθμός κυκλοφορίας
     * @param leasing_hours Οι ώρες μίσθωσης
     * @param cost_per_hour Η χρέωση ανά ώρα
     */
    public PartTimeLeasing(String car_id, int leasing_hours, double cost_per_hour) {
        super(car_id); // Κλήση του κατασκευαστή της υπερκλάσης για το car_id
        this.leasing_hours = leasing_hours; // Αποθήκευση των ωρών μίσθωσης
        this.cost_per_hour = cost_per_hour; // Αποθήκευση της χρέωσης ανά ώρα
    }

    /**
     * Υλοποίηση της αφηρημένης μεθόδου getLeasingCost
     * @return Το συνολικό κόστος μίσθωσης (leasing_hours * cost_per_hour)
     */
    @Override
    public double getLeasingCost() {
        return leasing_hours * cost_per_hour;
    }
}
