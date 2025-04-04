interface Barking {
    void bark(); 
}

interface Fetching {
    void fetch();
}

class Dog implements Barking, Fetching {
    
    public void bark() {
        System.out.println("Woof! Woof!");
    }

    public void fetch() {
        System.out.println("Fetching the ball!");
    }
}

public class DogShow {
    public static void main(String[] args) {
      
        Dog dog = new Dog();

        dog.bark();       
        dog.fetch();  
    }
}
