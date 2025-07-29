import java.util.Scanner;
public class MySentence2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //-->Δημιουργία Scanner για είσοδο από πληκτρολόγιο
        MyStrings myStrings = null; //-->Αντικείμενο ως null
        int choice;
        do {
            choice = menu(scanner);//-->Κλήση του μενού με Scanner
            switch (choice) {
                case 1:
                    System.out.println("Enter input sentence:");
                    String sentence = scanner.nextLine(); //-->Πρόταση
                    myStrings = new MyStrings(sentence); //-->Αντικείμενο MyStrings
                    System.out.println("Sentence has been processed.");
                    break;
                case 2:
                    if (myStrings == null) {
                        System.out.println("Error: You must input a sentence first (Option 1).");
                    } else {
                        System.out.println("Enter a word to search for:");
                        String word = scanner.nextLine(); 
                        myStrings.search_string(word); //-->Κλήση μεθόδου
                    }
                    break;
                case 3:
                    if (myStrings == null) {
                        System.out.println("Error: You must input a sentence first (Option 1).");
                    } else {
                        System.out.println("Enter a character to calculate average appearances:");
                        char character = scanner.nextLine().charAt(0);
                        myStrings.search_character(character);
                    }
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        scanner.close(); //-->Τέλος Scanner
    }
    public static int menu(Scanner scanner) {
        int choice; //-->Μεταβλητή για την επιλογή του χρήστη
        do {
            System.out.println("--------------- MENU ---------------");
            System.out.println("1. Input sentence");
            System.out.println("2. Search word in input sentence");
            System.out.println("3. Average number of appearances per word for character");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            while (!scanner.hasNextInt()) { // Έλεγχος για αριθμό
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                System.out.print("Your choice: ");
                scanner.next(); //-->Καθαρισμός εισόδου
            }
            choice = scanner.nextInt();
            scanner.nextLine(); //-->Καθαρισμός γραμμής
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice < 1 || choice > 4);
        return choice; //--> Επιστροφή επιλογής
    }
}
