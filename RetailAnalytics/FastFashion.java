public class FastFashion {
    public int[][] week_sales;//--> πεδία κλάσης
    public double[][] week_earnings;
    public int shops_count;
    public int products_count;
    public FastFashion(int[][] sales, double[][] earnings) {//-->Constructor
        if (sales.length != earnings.length || sales[0].length != earnings[0].length) {
            System.out.println("Error: Sales and earnings arrays must have the same dimensions.");
            System.exit(1);
        }
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] < 0 || earnings[i][j] < 0) {
                    System.out.println("Error: All values in sales and earnings arrays must be non-negative.");
                    System.exit(1);
                }
            }
        }
        this.week_sales = sales;
        this.week_earnings = earnings;
        this.shops_count = sales.length;
        this.products_count = sales[0].length;
    }
    public void calculateShopWeekSales() {//--> Πωλήσεις/Κατάστημα
        for (int i = 0; i < shops_count; i++) {
            int totalSales = 0;
            for (int j = 0; j < products_count; j++) {
                totalSales += week_sales[i][j];
            }
            System.out.println("Shop No: " + (i + 1) + " -> Total weekly sales are: " + totalSales);
        }
    }
    public void calculateShopWeekEarnings() {//--> Κέρδη/Κατάστημα
        for (int i = 0; i < shops_count; i++) {
            double totalEarnings = 0.0;
            for (int j = 0; j < products_count; j++) {
                totalEarnings += week_earnings[i][j];
            }
            System.out.println("Shop No: " + (i + 1) + " -> Total weekly earnings are: " + String.format("%.2f", totalEarnings));
        }
    }
}
