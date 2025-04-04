class Dog {
    void bark() {
        System.out.println("The dog barks happily!");
    }
}

class Bulldog extends Dog {
    void breed() {
        System.out.println("This dog is a Bulldog.");
    }
}

class GermanShepherd extends Bulldog {
    void run() {
        System.out.println("The German Shepherd can run at top speed of 50 km/h!");
    }
}

public class DogShow {
    public static void main(String[] args) {
        GermanShepherd max = new GermanShepherd();
        
        max.bark();
        
        max.breed();
        
        max.run();
    }
}
