import java.io.*;

public class Library {
    public static void main(String[] args) {
       
        String bookFilename = "library_book.txt";

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(bookFilename))) {
            writer.write("This is a book in the library.");
            writer.newLine(); 
            writer.write("This is the second page of the book.");
            System.out.println("Book added to library successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while adding the book to the library.");
            e.printStackTrace();
        }

        
        try (BufferedReader reader = new BufferedReader(new FileReader(bookFilename))) {
            String line;
            System.out.println("Reading from the library book:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the book.");
            e.printStackTrace();
        }
    }
}
