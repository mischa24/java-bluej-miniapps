import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FastFashionToFile extends FastFashion {
    private static String fast_fashion_name;//--> Μεταβλητή static ονόματος
    private String prefecture;//-->private πεδίο για κάθε νομό
    public FastFashionToFile(int[][] sales, double[][] earnings) {//-->Constructor που καλεί constructor Υπερκλάσης
        super(sales, earnings); //--> Κλήση Contructor FastFashion
    }
    public static void setFastFashionName(String name) {//--> Μέθοδος static για ανάθεση ονόματος
        fast_fashion_name = name;
    }
    public void setPrefecture(String prefecture) {//--> Μέθοδος ανάθεσης ονόματος για κάθε νομό
        this.prefecture = prefecture;
    }
    public String getPrefecture() {//-->μέθοδος επιστροφής ονόματος κάθε νομού
        return this.prefecture;
    }
    @Override //--> Yπερκάλυψη μεθόδου
    public void calculateShopWeekSales() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(prefecture + ".txt", true))) {
            writer.write("========== Shop Weekly Sales ==========\n");
            for (int i = 0; i < shops_count; i++) {
                int totalSales = 0;
                for (int j = 0; j < products_count; j++) {
                    totalSales += week_sales[i][j];
                }
                writer.write("Shop No: " + (i + 1) + " -> Total weekly sales are: " + totalSales + "\n");
            }
            writer.write("\n"); //-->Προσθήκη κενής γραμμής
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    @Override//--> Υπερκάλυψη μεθόοδου
    public void calculateShopWeekEarnings() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(prefecture + ".txt", true))) {
            writer.write("========== Shop Weekly Earnings ==========\n");
            for (int i = 0; i < shops_count; i++) {
                double totalEarnings = 0.0;
                for (int j = 0; j < products_count; j++) {
                    totalEarnings += week_earnings[i][j];
                }
                writer.write("Shop No: " + (i + 1) + " -> Total weekly earnings are: " + String.format("%.2f", totalEarnings) + "\n");
            }
            writer.write("\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
