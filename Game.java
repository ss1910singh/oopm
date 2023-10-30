import java.util.Scanner;


class Student {
    String roll_no;
    void getnumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        roll_no = scanner.nextLine();
    }
    void putnumber() {
        System.out.println("\nRoll Number: " + roll_no);
    }
}

class Test extends Student {
    float sem1, sem2;

    void getmarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Semester 1 Marks: ");
        sem1 = scanner.nextFloat();
        System.out.print("Enter Semester 2 Marks: ");
        sem2 = scanner.nextFloat();
    }
    void putmarks() {
        System.out.println("Semester 1 Marks: " + sem1);
        System.out.println("Semester 2 Marks: " + sem2);
    }
}

interface Sports {
    float score = 0.0f;

    void getscore(); 
}

class Result extends Test implements Sports {
    float total, sportsScore;
    void display() {
        total = sem1 + sem2 + sportsScore;
        putnumber();
        putmarks();
        putscore();
        System.out.println("Total Marks: " + total);
    }
    public void putscore() {
        System.out.println("Sports Score: " + sportsScore);
    }
    public void getscore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sports Score: ");
        sportsScore = scanner.nextFloat();
    }
}

public class Game{
    public static void main(String[] args) {
        Result result = new Result();
        result.getnumber();
        result.getmarks();
        result.getscore();
        result.display();
    }
}
