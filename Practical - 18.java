class Dog {
    String breed;
    int topSpeed;

    Dog(String breed, int topSpeed) {
        this.breed = breed;
        this.topSpeed = topSpeed;
    }

    public String toString() {
        return "Dog Breed: " + breed + ", Top Speed: " + topSpeed + " km/h";
    }
}

public class DogShow {
    public static void main(String[] args) {
       
        Dog dog1 = new Dog("Greyhound", 75);
        Dog dog2 = new Dog("Beagle", 40);
        Dog dog3 = new Dog("Bulldog", 20);
        Dog dog4 = new Dog("Border Collie", 50);
        Dog dog5 = new Dog("Pug", 15);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);
    }
}
