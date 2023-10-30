import java.util.Scanner;

public class Area_of_Rectangle_and_Square
{
public static void main(String[] args)
{
int length,breadth,area,perimeter;
Scanner s=new Scanner(System.in);
System.out.println("Enter LENGTH of Rectangle");
length=s.nextInt();
System.out.println("Enter BREADTH of Rectangle");
breadth=s.nextInt();
area=length*breadth;
perimeter=2*(length+breadth);
System.out.println("AREA of Rectangle:- "+area);
System.out.println("PERIMETER of Rectangle:- "+perimeter);

System.out.println("");

System.out.println("Enter LENGTH of Square");
length=s.nextInt();
area=length*length;
perimeter=4*length;
System.out.println("AREA of Square:- "+area);
System.out.println("PERIMETER of Square:- "+perimeter);
}
}