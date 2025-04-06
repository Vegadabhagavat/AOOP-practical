public class PrimeNumberFinder {
    public static void main(String[] args) {
        int maxNumber = 20;   
        int currentNumber;   
        int divisor;          

        for (currentNumber = 2; currentNumber <= maxNumber; currentNumber++) {
            for (divisor = 2; divisor <= currentNumber / 2; divisor++) {
                if (currentNumber % divisor == 0) {
                    break;  
                }
            }
            if (divisor == currentNumber) {
                System.out.println(currentNumber);  
            }
        }
    }
}
