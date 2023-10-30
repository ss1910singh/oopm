
import java.util.Scanner;
public class Marks_Exp1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the marks:");
int a=s.nextInt();
a=a/10;

switch(a)
{
case 0:
case 1:
case 2:
case 3:
System.out.println("FAIL");
break;
case 4:
System.out.println("PASS");
break;
case 5:
System.out.println("Second Class");
break;
case 6:
System.out.println("First Class");
break;
case 7:
case 8:
case 9:
case 10:
System.out.println("DISTINCTION");
break;

}
}
}