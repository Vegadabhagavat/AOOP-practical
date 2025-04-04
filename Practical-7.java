public class Book {
    
    private double length;  
    private double width;  
    
    public Book(double length, double width) {
        this.length = length;
        this.width = width;
    }
 
    public double getPageArea() {
        return length * width;  
    }

    public void displayDetails() {
        System.out.println("Length (Height) of Book: " + length);
        System.out.println("Width of Book: " + width);
        System.out.println("Page Area: " + getPageArea());
    }

    public static void main(String[] args) {
        Book book = new Book(8.5, 5.5);  
        book.displayDetails();
    }
}
