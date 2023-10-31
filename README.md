# Marks_Exp1.java:- EXP1:-
The grading system describes how well students have achieved the learning
objectives or goals established for a class of course of study. This system helps to
categorize the students according to their grades. Design a system that reads marks
obtained by a student in a test of 100 marks and assign the grade as per the following
criteria.



# PrimeNumbers.java:- EXP2:-
Prime numbers are important because the security of many encryption
algorithms are based on the fact that it is very fast to multiply two large numbers and
get the result, while it is extremely computer-intensive to do the reverse. Enlist all the
prime numbers between 1 to 1000 to create a base for cryptography.



# Area_of_Rectangle_and_Square.java:- EXP3:-
The vendor provide a rubber material that provides the protection to the edges
of rectangular object and paper material for protection of front and back of
rectangular object. So a vendor needs a application to calculate the amount of rubber
and paper material required for covering rectangular object. Write area method for
calculating area of rectangle and square.(using class and object)



# Methodoverloading:- EXP4:-
School students need to study and learn formula for calculating area of different
shapes like circle, rectangle , triangle and square. Design an application which will
read require parameters for the area calculation of different shapes (use method
overloading)



# Passing_and_Returning.java:- EXP5:- 
An electrical engineer needs a complex number calculator for performing the
operation of addition of alternating current represented using complex number. Create
an application that takes two complex numbers as parameters and returns the resulting
complex number, which is the addition of two complex numbers.



# Array.java:- EXP6:- 
2D array is used in many real-life applications where we need to organize
data in tabular/matrix format. Hence a matrix manipulator is required with
functionality of reading, displaying and flipping data from the matrix. Generate
the methods, for the functionality mentioned above for creation the matrix
manipulator.



# Palindrome.java:- EXP7:- 
A character sequence is to be read as an input and result need to declare as
“yes” or “no” by investigating the fact that traversing the characters sequence
backwards and forwards results in same sequence. Write a program for the same using
StringBuffer.



# Inheritance.java:- EXP8:-  
Write a program to calculate volume of sphere using multilevel inheritance. The
base class method will accept the radius from user. A class will be derived from the
above-mentioned class that will have a method to find the area of a circle derived
from this will have method to calculate and display the volume of the sphere.


  
# Game.java:- EXP9:-
Consider a university where students who participate in the National Games or
Olympics are given some grace marks. The grace marks provided are fixed and same
for every student. Create an application that keeps student’s academic marks and
Sports grace marks separate and generate total of marks considering academics and
sports both. Also invoke methods of base class & interface using reference


  
# Exception_error.java:- EXP10:- 
Through Custom exception user can raise application-specific error code. You
are required to calculate a square of even number provided as input by user. However,
if a user provides an odd number as input, then an exception must be thrown explicitly
with message indicating the input number must be even number.



# Multithreading.java:- EXP11:-
Divide your program into two parts: One to read a number and the other to
calculate its square. Provide a simultaneous execution of both parts of a program to
maximum utilize the CPU time.



# Calculator.java:- EXP12:-
Create a GUI application which is fully equipped with the functionality of
solving various computation problems such as Addition, subtraction, Multiplication
and Division. The GUI application should runs in a browser and displays the output as
result of these mathematical operations.


# 1
Write a Java script. Given three classes: in it, the subclass BoxWeight is used as a super class to create the subclass called Shipment. Shipment inherits all of the traits of BoxWeight and Box, and adds a field called Cost, which holds the cost of shipping such a parcel. NOTE: Use parameterized constructor for 
Box, consider dimensions: width, height, depth. Main class would be DemoShipment.
class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getVolume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    private double weight;

    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

class Shipment extends BoxWeight {
    private double cost;

    public Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(10.0, 5.0, 3.0, 2.5, 20.0);
        double volume = shipment.getVolume();
        double weight = shipment.getWeight();
        double cost = shipment.getCost();

        System.out.println("Volume: " + volume);
        System.out.println("Weight: " + weight);
        System.out.println("Cost: " + cost);
    }
}


# 2
Write a Java script, as per mentioned in description. Create two classes, A and B, with methods foo( ) and bar( ), respectively, which pause briefly before trying to call a method in the other class. The main class, named Deadlock, creates an A and a B instance, and then starts a second thread to set up the deadlock condition. The foo( ) and bar( ) methods use sleep( ) as a way to force the deadlock condition to occur.
class A {
    public synchronized void foo(B b) {
        System.out.println("Thread 1: foo() called");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 1: Trying to call B's bar()");
        b.bar();
    }

    public synchronized void bar() {
        System.out.println("Thread 1: Inside A's bar()");
    }
}

class B {
    public synchronized void bar(A a) {
        System.out.println("Thread 2: bar() called");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 2: Trying to call A's foo()");
        a.foo(this);
    }

    public synchronized void foo() {
        System.out.println("Thread 2: Inside B's foo()");
    }
}

public class Deadlock {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // Create two threads to demonstrate the deadlock condition
        Thread thread1 = new Thread(() -> {
            a.foo(b);
        });

        Thread thread2 = new Thread(() -> {
            b.bar(a);
        });

        thread1.start();
        thread2.start();
    }
}


# 3
Consider a university where students who participate in the National Games or Olympics are given some grace marks. The grace marks provided are fixed and same for every student. Create an application that keeps student’s academic marks and Sports grace marks separate and generate total of marks considering academics and sports both. Also invoke methods of base class & interface using reference.
// Define an interface for sports grace marks
interface Sports {
    void addSportsMarks(int marks);
}

// Create a base class for students
class Student {
    String name;
    int academicMarks;

    public Student(String name, int academicMarks) {
        this.name = name;
        this.academicMarks = academicMarks;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Academic Marks: " + academicMarks);
    }
}

// Create a derived class for students who participate in sports
class SportsStudent extends Student implements Sports {
    int sportsMarks;

    public SportsStudent(String name, int academicMarks, int sportsMarks) {
        super(name, academicMarks);
        this.sportsMarks = sportsMarks;
    }

    @Override
    public void addSportsMarks(int marks) {
        sportsMarks += marks;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sports Marks: " + sportsMarks);
    }

    public int calculateTotalMarks() {
        return academicMarks + sportsMarks;
    }
}

public class UniversityApplication {
    public static void main(String[] args) {
        // Create a SportsStudent object
        SportsStudent student1 = new SportsStudent("John", 85, 10);

        // Display student information
        student1.displayInfo();

        // Add sports grace marks
        student1.addSportsMarks(5);

        // Calculate and display total marks
        int totalMarks = student1.calculateTotalMarks();
        System.out.println("Total Marks: " + totalMarks);
    }
}


# 4
Through Custom exception user can raise application-specific error code. Write a JAVA program to calculate a square of even number provided as input by user. However, if a user provides an odd number as input, then an exception must be thrown explicitly with message indicating the input number must be even number.
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class CalculateSquare {
    public static void main(String[] args) {
        try {
            int number = getUserInput();
            int square = calculateSquare(number);
            System.out.println("Square of " + number + " is " + square);
        } catch (InvalidNumberException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int getUserInput() throws InvalidNumberException {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter an even number: ");
        int number = sc.nextInt();
        if (number % 2 != 0) {
            throw new InvalidNumberException("Input number must be even");
        }
        return number;
    }

    public static int calculateSquare(int number) {
        return number * number;
    }
}


# 5
A character sequence is to be read as an input and result need to declare as “yes” or “no” by investigating the fact that traversing the characters sequence backwards and forwards results in same sequence. Write a program for the same using StringBuffer.
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character sequence: ");
        String input = scanner.nextLine();

        boolean isPalindrome = isPalindrome(input);

        if (isPalindrome) {
            System.out.println("Yes, it's a palindrome.");
        } else {
            System.out.println("No, it's not a palindrome.");
        }
    }

    public static boolean isPalindrome(String input) {
        // Remove spaces and convert to lowercase for accurate comparison
        input = input.replaceAll("\\s", "").toLowerCase();

        // Create a StringBuffer to reverse the input
        StringBuffer reversedInput = new StringBuffer(input);
        reversedInput.reverse();

        // Compare the original and reversed strings
        return input.equals(reversedInput.toString());
    }
}


# 6
Write a graphics JAVA program to display “All the best “ using frame
import javax.swing.*;

public class DisplayMessage extends JFrame {
    public DisplayMessage() {
        setTitle("Display Message");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);

        JLabel label = new JLabel("All the best");
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);

        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DisplayMessage();
        });
    }
}

# 7
Write abstract class program to calculate area of circle, rectangle and triangle.
// Abstract class Shape
abstract class Shape {
    abstract double calculateArea();
}

// Concrete class Circle extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class Rectangle extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Concrete class Triangle extending Shape
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 4.0);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}


 # 8
 Write a program to create package and show the execution of the same.
 // MyClass.java
package com.mypackage;

public class MyClass {
    public void displayMessage() {
        System.out.println("Hello from MyClass!");
    }
}

// PackageTest.java
import com.mypackage.MyClass;

public class PackageTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.displayMessage();
    }
}
