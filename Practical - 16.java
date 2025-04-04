class Dog {
    void breedInfo() {
        System.out.println("This is a dog, and different breeds have unique characteristics.");
    }
}

class Labrador extends Dog {
    void friendlyNature() {
        System.out.println("Labradors are known for their friendly and outgoing nature.");
    }
}

class Beagle extends Dog {
    void sniffingSkills() {
        System.out.println("Beagles have exceptional sniffing and tracking skills.");
    }
}

public class DogShow {
    public static void main(String[] args) {
        Labrador max = new Labrador();
        max.breedInfo();  
        max.friendlyNature();  

        Beagle bella = new Beagle();
        bella.breedInfo();  
        bella.sniffingSkills();  
    }
}
