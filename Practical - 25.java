class Engine1 extends Thread {
    
    public void run() {
        try {
            while (true) {
                System.out.println("Engine1 running");
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}


class Engine2 extends Thread {

    public void run() {
        try {
            while (true) {
                System.out.println("Engine2 running");
                Thread.sleep(2000); 
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Car {
    public static void main(String[] args) {
        
        Engine1 carEngine1 = new Engine1();
        Engine2 carEngine2 = new Engine2();

        carEngine1.start();
        carEngine2.start();
    }
}
