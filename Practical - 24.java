public class NotSufficientFundException extends Exception {
    public NotSufficientFundException(String message) {
        super(message);  
    }
}

import java.util.Scanner;

public class BankingApplication {
    private double balance;

    
    public BankingApplication(double initialBalance) {
        this.balance = initialBalance;
    }

   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
        System.out.println("Current Balance: Rs. " + balance);
    }

    
    public void withdraw(double amount) throws NotSufficientFundException {
        if (amount > balance) {
            throw new NotSufficientFundException("Error: Not Sufficient Fund!");
        }
        balance -= amount;
        System.out.println("Withdrew: Rs. " + amount);
        System.out.println("Current Balance: Rs. " + balance);
    }

    public static void main(String[] args) {
      
        BankingApplication account = new BankingApplication(25000);
        
       
        account.deposit(25000);

      
        try {
            account.withdraw(20000);
        } catch (NotSufficientFundException e) {
            System.out.println(e.getMessage());
        }

       
        try {
            account.withdraw(4000);
        } catch (NotSufficientFundException e) {
            System.out.println(e.getMessage());
        }

       
        try {
            account.withdraw(2000);
        } catch (NotSufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}
