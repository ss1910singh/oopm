import java.util.Scanner;

class EvenNumberException extends Exception {
    int errorCode;

    public EvenNumberException(int code) {
        errorCode = code;
    }

    public String getMessage() {
       
                return "Input number must be even.";
            
        }
    }


class Exception_error {
    public static void squareOfEven(int number) throws EvenNumberException {
        if (number % 2 != 0) {
            throw new EvenNumberException(1); 
        }
        int result = number * number;
        System.out.println("Square of " + number + " is " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int userNumber = scanner.nextInt();
            squareOfEven(userNumber);
        } catch (EvenNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
