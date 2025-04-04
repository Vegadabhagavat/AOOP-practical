abstract class DogBehavior {
    abstract void performAction();
}

class Barking extends DogBehavior {
    String breed;

    Barking(String breed) {
        this.breed = breed;
    }

    void performAction() {
        System.out.println(breed + " is barking!");
    }
}

class Fetching extends DogBehavior {
    String breed;

    Fetching(String breed) {
        this.breed = breed;
    }

    void performAction() {
        System.out.println(breed + " is fetching the ball!");
    }
}

class Playing extends DogBehavior {
    String breed;

    Playing(String breed) {
        this.breed = breed;
    }

    void performAction() {
        System.out.println(breed + " is playing with the toy!");
    }
}

public class DogShow {
    public static void main(String[] args) {

        DogBehavior goldenRetriever = new Barking("Golden Retriever");
        DogBehavior beagle = new Fetching("Beagle");
        DogBehavior bulldog = new Playing("Bulldog");

        goldenRetriever.performAction();
        beagle.performAction();
        bulldog.performAction();
    }
}
