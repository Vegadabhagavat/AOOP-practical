public class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message); 
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();

        try {
          
            if (denominator == 0) {
                throw new DivideByZeroException("Error: Cannot divide by zero!");
            }

          
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (DivideByZeroException e) {
            
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
