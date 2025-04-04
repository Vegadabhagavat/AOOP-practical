class Dog {

    void behavior() {
        System.out.println("Dogs are playful and loyal companions.");
    }
}

class Retriever extends Dog {

    void fetch() {
        System.out.println("The retriever loves fetching the ball!");
    }
}

public class DogShow {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.behavior();  

        Retriever dog2 = new Retriever();
        dog2.fetch();  
    }
}
