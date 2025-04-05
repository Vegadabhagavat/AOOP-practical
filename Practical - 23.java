import java.util.Scanner;

public class NoPagesException extends Exception {
    public NoPagesException(String message) {
        super(message);
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bookPages = scanner.nextInt();
        int borrowedBooks = scanner.nextInt();

        try {
            if (bookPages == 0) {
                throw new NoPagesException("Error: The book has no pages!");
            }

            int pagesPerBook = bookPages / borrowedBooks;
            System.out.println("You need to read " + pagesPerBook + " pages from each book.");

        } catch (NoPagesException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
