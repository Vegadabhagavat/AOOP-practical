final class Dog {
    String breed;

    Dog(String breed) {
        this.breed = breed;
    }

    void bark() {
        System.out.println("Dog breed: " + breed);
    }
    public static void main(String[] args) {
        Dog myDog = new Dog("Golden Retriever");
        myDog.bark();
    }
}
