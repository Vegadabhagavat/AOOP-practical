import java.util.HashMap;

public class WarehouseInventory {
    public static void main(String[] args) {
        
        HashMap<Integer, String> inventory = new HashMap<>();

        inventory.put(101, "Laptop");
        inventory.put(102, "Smartphone");
        inventory.put(103, "Headphones");
        inventory.put(104, "Smartwatch");
        inventory.put(105, "Tablet");

        int productId = 103;
        if (inventory.containsKey(productId)) {
            System.out.println("Product with Product ID " + productId + " is: " + inventory.get(productId));
        } else {
            System.out.println("Product not found with Product ID " + productId);
        }
    }
}
