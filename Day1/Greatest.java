import java.util.*;
import java.io.*;
public class Greatest
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a=s.nextInt();
        System.out.println("Enter Second Number:");
        int b=s.nextInt();
        if(a>b)
        {
            System.out.println("Greatest number is " +a);
        }
        else
        {
            System.out.println("Greatest number is " +b);
        }
    }
}