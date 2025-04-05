import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LibraryDemo {
    public static void main(String[] args) {
       
        List<String> booksOnShelf = new ArrayList<>();
        booksOnShelf.add("The Great Gatsby");
        booksOnShelf.add("To Kill a Mockingbird");
        booksOnShelf.add("1984");
        booksOnShelf.add("Moby Dick");
        booksOnShelf.add("Pride and Prejudice");
        booksOnShelf.add("War and Peace");
        booksOnShelf.add("The Catcher in the Rye");

        System.out.println("Books on the Shelf (ArrayList):");
        for (String book : booksOnShelf) {
            System.out.println(book);
        }

        List<String> booksInReadingList = new LinkedList<>();
        booksInReadingList.add("The Hobbit");
        booksInReadingList.add("Catch-22");
        booksInReadingList.add("Brave New World");
        booksInReadingList.add("The Odyssey");
        booksInReadingList.add("The Brothers Karamazov");
        booksInReadingList.add("Crime and Punishment");
        booksInReadingList.add("Ulysses");
        booksInReadingList.add("The Divine Comedy");
        booksInReadingList.add("Don Quixote");
        booksInReadingList.add("One Hundred Years of Solitude");
        booksInReadingList.add("The Bible");
        booksInReadingList.add("The Quran");

        System.out.println("\nBooks in the Reading List (LinkedList):");
        for (String book : booksInReadingList) {
            System.out.println(book);
        }
    }
}
