import java.util.*;
import java.io.*;
public class Sum
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First number:");
        int n1=s.nextInt();
        System.out.println("Enter Second number:");
        int n2=s.nextInt();
        int n3=n1+n2;
        if(n3%2==0)
        {
            System.out.println("The sum of the entered numbers are " +n3);
            System.out.println( n3 +"is an even number");
        }
        else
        {
            System.out.print("The sum of the entered numbers are " +n3);
            System.out.println( n3 +"is a odd number");
        }
    }
}