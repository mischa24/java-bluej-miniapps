public class FullTimeLeasing extends CarLeasing {
    // Ιδιωτικό πεδίο για το σταθερό κόστος μίσθωσης
    private double leasing_cost;

    /**
     * Κατασκευαστής που δέχεται τον αριθμό κυκλοφορίας και το κόστος μίσθωσης
     * @param car_id Ο αριθμός κυκλοφορίας
     * @param leasing_cost Το σταθερό κόστος μίσθωσης
     */
    public FullTimeLeasing(String car_id, double leasing_cost) {
        super(car_id); // Κλήση του κατασκευαστή της υπερκλάσης για το car_id
        this.leasing_cost = leasing_cost; // Αποθήκευση του κόστους μίσθωσης
    }

    /**
     * Υλοποίηση της αφηρημένης μεθόδου getLeasingCost
     * @return Το κόστος μίσθωσης (σταθερό)
     */
    @Override
    public double getLeasingCost() {
        return leasing_cost;
    }
}
