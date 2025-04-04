class BankAccount {
 
    final int MAX_BALANCE = 10000;  
   
    final void showAccountMessage() {
        System.out.println("This is a secure bank account.");
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
 
        
        System.out.println("Maximum Balance: " + account.MAX_BALANCE);

      
        account.showAccountMessage();
    }
}
