public class MySentence1 { //--> χρήση MyStrings για επεξεργασία κ αναζήτηση λέξεων κ χαρακτήρων. Main program με αντίστοιχες λειτουργίες.
    public static void main(String[] args) {
        MyStrings firstSentence = new MyStrings( // Αντικείμενο MyStrings πρότασης
            "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe."
        );
        MyStrings secondSentence = new MyStrings( //--> Δεύτερο αντικείμενο MyStrings επόμενης πρότασης
            "You've gotta dance like there's nobody watching, Love like you'll never be hurt, Sing like there's nobody listening, and Live like it's heaven on earth."
        );
        System.out.println("=== First Sentence ==="); //--> Τίτλος πρώτης πρότασης
        firstSentence.searchString("the"); //--> αναζήτηση λέξεων στην πρόταση
        firstSentence.searchString("like");
        firstSentence.searchCharacter('e'); //--> αναζήτηση χαρακτήρων στην πρόταση
        firstSentence.searchCharacter('t');
        System.out.println(); //--> διαχωρισμός με κενή γραμμή
        System.out.println("=== Second Sentence ==="); //--> εμφάνιση τίτλου επόμενης πρότασης
        secondSentence.searchString("the"); //--> αναζήτηση λέξεων
        secondSentence.searchString("like");
        secondSentence.searchCharacter('e'); //--> αναζήτηση χαρακτήρων πρότασης
        secondSentence.searchCharacter('t');
        MyStrings.printSentences(); //--> προτάσεις αναφοράς
    }
}
