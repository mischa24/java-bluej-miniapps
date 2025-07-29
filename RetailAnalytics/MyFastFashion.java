public class MyFastFashion {
    public static void main(String[] args) {
        int[][] week_sales = {//--> πίνακας τιμών
            {123, 429, 200, 190, 421, 602},
            {180, 250, 512, 300, 219, 120},
            {200, 583, 710, 419, 231, 287},
            {563, 369, 344, 445, 654, 231},
            {178, 424, 555, 215, 287, 164}
        };
        double[][] week_earnings = {
            {33300.20, 50000.60, 100020.20, 120000.00, 20000.00, 34000.25},
            {22500.00, 18000.27, 50520.00, 6600.00, 56300.70, 21000.14},
            {52470.34, 45000.50, 87200.65, 52250.00, 14500.00, 12000.00},
            {33210.72, 56300.70, 44520.00, 12705.00, 33300.20, 31500.90},
            {38160.00, 17800.00, 19800.42, 9020.63, 22500.00, 14910.20}
        };
        FastFashion fastFashion1 = new FastFashion(week_sales, week_earnings);//--> Αντικείμενο FastFashion με αντίστοιχους πίνακες
        System.out.println("========== Shop Weekly Sales ==========");//--> Μέθοδοι υπολογισμών
        fastFashion1.calculateShopWeekSales(); //-->Πωλήσεις/κατάστημα
        System.out.println("\n========== Shop Weekly Earnings ==========");
        fastFashion1.calculateShopWeekEarnings(); //-->Κέρδη/κατάστημα
    }
}
