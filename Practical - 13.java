public class Book {

    public static void main(String[] args) {

        String bookTitle = "The Adventures of Java in Programming World";

        char characterAtPosition = bookTitle.charAt(7);  
        System.out.println("Character at index 7: " + characterAtPosition);

        boolean containsWord = bookTitle.contains("Adventures"); 
        System.out.println("Does the book title contain 'Adventures'? " + containsWord);

        String formattedLength = String.format("The length of the book title is: %d", bookTitle.length());
        System.out.println(formattedLength);

        int titleLength = bookTitle.length();  
        System.out.println("Length of the book title: " + titleLength);

        String[] titleWords = bookTitle.split(" ");  
        System.out.println("Words in the book title:");
        for (String word : titleWords) {
            System.out.println(word);
        }
    }
}
