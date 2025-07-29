public class FastFashion_ {
    public int[][] week_sales;
    public double[][] week_earnings;
    public int shops_count;
    public int products_count;
    public FastFashion_() {// Κατασκευαστής με ενσωματωμένα δεδομένα
        this.week_sales = new int[][] { // Προκαθορισμένα δεδομένα για week_sales
            {123, 429, 200, 190, 421, 602},
            {180, 250, 512, 300, 219, 120},
            {200, 583, 710, 419, 231, 287},
            {563, 369, 344, 445, 654, 231},
            {178, 424, 555, 215, 287, 164}
        };
        this.week_earnings = new double[][] { // Προκαθορισμένα δεδομένα για week_earnings
            {33300.20, 50000.60, 100020.20, 120000.00, 20000.00, 34000.25},
            {22500.00, 18000.27, 50520.00, 6600.00, 56300.70, 21000.14},
            {52470.34, 45000.50, 87200.65, 52250.00, 14500.00, 12000.00},
            {33210.72, 56300.70, 44520.00, 12705.00, 33300.20, 31500.90},
            {38160.00, 17800.00, 19800.42, 9020.63, 22500.00, 14910.20}
        };
        this.shops_count = this.week_sales.length;  // Αποθήκευση του πλήθους καταστημάτων και προϊόντων
        this.products_count = this.week_sales[0].length;
    }
    public void calculateShopWeekSales() { // Μέθοδοι Υπολογισμού
        for (int i = 0; i < shops_count; i++) {
            int totalSales = 0;
            for (int j = 0; j < products_count; j++) {
                totalSales += week_sales[i][j];
            }
            System.out.println("Shop No: " + (i + 1) + " -> Total weekly sales are: " + totalSales);
        }
    }
    public void calculateShopWeekEarnings() {
        for (int i = 0; i < shops_count; i++) {
            double totalEarnings = 0.0;
            for (int j = 0; j < products_count; j++) {
                totalEarnings += week_earnings[i][j];
            }
            System.out.println("Shop No: " + (i + 1) + " -> Total weekly earnings are: " + String.format("%.2f", totalEarnings));
        }
    }
}
