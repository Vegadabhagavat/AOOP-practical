class Dog {
  
    String breed;

    Dog(String breed) {
        this.breed = breed;
    }

    void performTrick() {
        System.out.println(breed + " performs a perfect roll over!");
    }
}

class GermanShepherd extends Dog {

    GermanShepherd(String breed) {
        super(breed);
    }

    void runSpeed() {
        System.out.println(breed + " can run at a speed of 50 km/h");
    }
}

public class PetShow {
    public static void main(String[] args) {

        GermanShepherd dog = new GermanShepherd("German Shepherd");

        dog.performTrick();

        dog.runSpeed();
    }
}
