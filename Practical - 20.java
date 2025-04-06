abstract class Shape {
 
    abstract double area();
}

class Triangle extends Shape {
    double base, height;

 
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}


class Rectangle extends Shape {
    double length, width;

    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }



    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

   
    Circle(double radius) {
        this.radius = radius;
    }

   
    double area() {
        return Math.PI * radius * radius;
    }
}


public class Main {
    public static void main(String[] args) {
      
        Shape triangle = new Triangle(10, 20);
        Shape rectangle = new Rectangle(6, 8);
        Shape circle = new Circle(7);

       
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
