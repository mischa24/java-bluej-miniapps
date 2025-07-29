public abstract class CarLeasing {
    // Ιδιωτικό πεδίο για τον αριθμό κυκλοφορίας
    private String car_id;

    /**
     * Κατασκευαστής που δέχεται τον αριθμό κυκλοφορίας
     * @param car_id Ο αριθμός κυκλοφορίας της πινακίδας
     */
    public CarLeasing(String car_id) {
        this.car_id = car_id;
    }

    /**
     * Αφηρημένη μέθοδος για την επιστροφή της χρέωσης μίσθωσης
     * Η υλοποίηση θα γίνει στις υποκλάσεις
     * @return Η χρέωση της μίσθωσης
     */
    public abstract double getLeasingCost();

    /**
     * Μέθοδος toString για την εμφάνιση των στοιχείων του αυτοκινήτου
     * @return Μορφοποιημένη συμβολοσειρά με τα δεδομένα
     */
    @Override
    public String toString() {
        return "ARITHMOS KYKLOFORIAS: " + car_id + " -> XREWSH MISTHWSIS: " + getLeasingCost();
    }
}
