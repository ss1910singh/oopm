import java.util.Scanner;

class PrintNumbers implements Runnable {
    int start, end;

    PrintNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println("Thread t1: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class PrintSquares implements Runnable {
    int start, end;

    PrintSquares(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println("Thread t2: " + (i * i));
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Multithreading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        PrintNumbers printNumbers = new PrintNumbers(start, end);
        PrintSquares printSquares = new PrintSquares(start, end);

        Thread t1 = new Thread(printNumbers);
        Thread t2 = new Thread(printSquares);

        t1.start();
        t2.start();

        scanner.close();
    }
}

