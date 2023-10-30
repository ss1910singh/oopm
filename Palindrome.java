import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        String str, rev = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = scanner.nextLine();
        
        StringBuffer str1 = new StringBuffer(str);
        
        str1.reverse();
        
        rev = str1.toString();
        
        if (str.equals(rev)) {
            System.out.println("String '" + str + "' is a palindrome.");
        } else {
            System.out.println("String '" + str + "' is not a palindrome.");
        }
        
        
    }
}
