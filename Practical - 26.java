class EvenNumbersThread extends Thread {
  
    public void run() {
        for (int i = 2; i <= 200; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100);  
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


class OddNumbersThread extends Thread {

    public void run() {
        for (int i = 1; i <= 200; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100);  
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        EvenNumbersThread evenThread = new EvenNumbersThread();
        OddNumbersThread oddThread = new OddNumbersThread();

       
        evenThread.start();
        oddThread.start();
    }
}
