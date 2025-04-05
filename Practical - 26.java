class EvenRouteBus extends Thread {
  
    public void run() {
        for (int i = 2; i <= 200; i += 2) {
            System.out.println("Bus on even route: " + i);
            try {
                Thread.sleep(100);  
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


class OddRouteBus extends Thread {

    public void run() {
        for (int i = 1; i <= 200; i += 2) {
            System.out.println("Bus on odd route: " + i);
            try {
                Thread.sleep(100);  
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class BusStation {
    public static void main(String[] args) {
        
        EvenRouteBus evenBus = new EvenRouteBus();
        OddRouteBus oddBus = new OddRouteBus();

        evenBus.start();
        oddBus.start();
    }
}
