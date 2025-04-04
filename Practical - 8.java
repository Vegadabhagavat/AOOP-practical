public class Car {
    int speed;  
   
    public Car(int speed) {
        this.speed = speed;
    }
  
    public static void main(String[] args) {
        Car myCar = new Car(60);  // Creating a car object with speed of 60
        System.out.println("Car's speed = " + myCar.speed + " km/h");
    }
}
