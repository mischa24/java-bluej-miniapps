public class MyFastFashionToFile {
    public static void main(String[] args) {
        FastFashionToFile.setFastFashionName("Zara");//--> Καθορισμός ονόματος αλυσίδας
        int[][] attiki_sales = {//--> Δεδομένα Αττικής
            {421, 321, 445, 500, 675},
            {219, 180, 921, 120, 250},
            {371, 200, 667, 95, 583},
            {112, 563, 200, 231, 369}
        };
        double[][] attiki_earnings = {
            {5225.55, 20500.00, 50000.60, 54000.50, 73100.20},
            {22500.00, 50520.00, 18000.27, 21000.14, 6600.00},
            {52470.34, 26280.45, 20000.00, 13020.22, 5225.55},
            {33210.72, 44520.00, 56300.70, 31500.90, 12705.00}
        };
        int[][] achaia_sales = {//--> Δεδομένα Αχαΐας 
            {320, 689, 150, 532, 234},
            {219, 200, 886, 95, 583},
            {165, 178, 318, 164, 424}
        };
        double[][] achaia_earnings = {
            {20500.00, 52470.34, 26280.45, 20000.00, 13020.00},
            {50520.00, 26280.45, 5225.55, 13020.22, 52470.34},
            {26280.45, 19800.42, 9020.63, 14910.20, 38160.00}
        };
        FastFashionToFile attiki = new FastFashionToFile(attiki_sales, attiki_earnings);//--> Αντικείμενο Αττικής
        attiki.setPrefecture("Attiki");
        FastFashionToFile achaia = new FastFashionToFile(achaia_sales, achaia_earnings);//--> Αντικείμενο Αχαΐας 
        achaia.setPrefecture("Achaia");
        attiki.calculateShopWeekSales();//--> Αποτελέσματα και αποθήκευση αποτελεσμάτων Αττικής
        attiki.calculateShopWeekEarnings();
        achaia.calculateShopWeekSales();//--> Αποτελέσματα και αποθήκευση Αχαΐας 
        achaia.calculateShopWeekEarnings();
    }
}
