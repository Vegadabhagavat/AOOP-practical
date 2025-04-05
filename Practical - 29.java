import java.util.HashSet;

public class FruitBasket {
    public static void main(String[] args) {
       
        HashSet<String> fruitsInBasket = new HashSet<>();

        fruitsInBasket.add("Apple");
        fruitsInBasket.add("Banana");
        fruitsInBasket.add("Orange");
        fruitsInBasket.add("Grapes");
        fruitsInBasket.add("Pineapple");

        System.out.println("Fruits in the Basket:");
        for (String fruit : fruitsInBasket) {
            System.out.println(fruit);
        }
    }
}
