import java.util.Scanner;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
}

class Area extends Circle {
    double area;

    Area(double radius) {
        super(radius);
    }

    void calculate() {
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    void display() {
        System.out.printf("Area of the circle with radius %.2f is %.2f square units.%n", this.radius, this.area);
    }
}

class Volume extends Area {
	
    double volume;

    Volume(double radius) {
        super(radius);
    }

    void calculate() {
        this.volume = (4.0 / 3.0) * 3.14 * Math.pow(this.radius, 3);
    }

    void display() {
        System.out.printf("Volume of the sphere with radius %.2f is %.2f cubic units.%n", this.radius, this.volume);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Volume sphere = new Volume(radius);

        sphere.calculate();
        sphere.display();
        
        
    }
}