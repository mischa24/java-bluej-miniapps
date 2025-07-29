//Στην MyStrings περιέχονται τρόποι διαχείρισης και επεξεργασίας με αναζήτηση λέξεων κ χαρακτήρων.
public class MyStrings {
    private String[] strings; // --> ο πίνακας για την αποθήκευση λέξεων
    public MyStrings(String sentence) { //--> constructor MyStrings. Αφαιρεί τα σηεμία στίξης στο τέλος της πρότασης, διαχωρισμός πρόοτασης σε λέξεις κ μετατροπή σε πεζά.
        sentence = sentence.replaceAll("[.!?]$", ""); //--> αφαίρεση σημείων στίξης
        this.strings = sentence.split("[ ,;:]+"); //--> διαχωρισμός πρότασης σε λέξεις
        for (int i = 0; i < strings.length; i++) { //--> μεταττροπή των λέξεων σε πεζά
            strings[i] = strings[i].toLowerCase();
        }
    }
    public int searchString(String word) { //--> Μέθοδος αναζήτησης λέξης με εμφάνιση των θέσεων που βρίσκεται η λέξη. (@param word: λέξη προς αναζήτηση) (@return:εμφανίσεις της λέξης)
        word = word.toLowerCase(); // --> μετατροπή σε πεζά
        boolean found = false; // --> εύρεση λέξης
        int count = 0; //--> μέτρηση εμφανίσεων
        for (int i = 0; i < strings.length; i++) { //--> αναζήτηση λέξης
            if (strings[i].equals(word)) {
                found = true;
                count++;
                System.out.println("The word '" + word + "' is found at position " + (i + 1) + ".");
            }
        }
        if (!found) { //--> μήνυμα εύρεσης λέξης
            System.out.println("The word '" + word + "' is not found.");
        }
        System.out.println("The word '" + word + "' appeared " + count + " times.");//--> Συνολικός αριθμός εμφανίσεων λέξης
        System.out.println(); //--> Κενή γραμμή 
        return count;
    }
    public double searchCharacter(char character) { //--> Μέθοδος εύρεσης χαρακτήρα στην πρόταση με αριθμό λέξεων κ μέσο όρο εμφάνισης/λέξη.(@param character:χαρακτήρας) (@Μέσος όρος εμφανίσεων/λέξη)
        int totalOccurrences = 0; // -->σύνολο εμφανίσεων
        int wordsWithCharacter = 0; //-->σύνολο λέξεων που περιέχουν τον χαρακτήρα
        for (String word : strings) { // --> αναζήτηση χαρακτήρα σε λέξεις
            int occurrencesInWord = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == character) {
                    occurrencesInWord++;
                }
            }
            if (occurrencesInWord > 0) {
                wordsWithCharacter++;
            }
            totalOccurrences += occurrencesInWord;
        }
        double average = (double) totalOccurrences / strings.length; //-->Μέσος όρος
        System.out.println("The character '" + character + "' appears in " + wordsWithCharacter + " words.");//--> Αποτελέσματα
        System.out.println("Average occurrences per word for character '" + character + "' is " + average);
        System.out.println(); //-->Κενή γραμμή
        return average;
    }
    public static void printSentences() { //--> εκτύπωση προτάσεων
        System.out.println("\nOriginal Sentences:");
        System.out.println("1. \"Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.\"");
        System.out.println("2. \"You've gotta dance like there's nobody watching, Love like you'll never be hurt, Sing like there's nobody listening, and Live like it's heaven on earth.\"\n");
    }
}
