import java.io.*;
import java.util.*;
public class Perfectsquare 
{
    public static void main(String[]args)
    {
        int arr[]={21,36,66};
        int n=arr.length;
        System.out.print("Least Perfect Square divisible  by 21,36,66 is: ");
        System.out.println(LeastPerfectSquare(arr,n));
    }
    public static int LeastPerfectSquare(int arr[],int n)
    {
        int minsquare;
        int l=arraylcm(arr,n);
        minsquare=(int)l;
        int count=0;
        while(l>1 && l%2==0)
        {
            count++;
            l=l/2;
        }
        if(count % 2 !=0)
        {
            minsquare= minsquare *2;
        }
        int i=3;
        while(l>1)
        {
            count=0;
            while(l%i==0)
            {
                count++;
                l=l/i;
            }
            if(count%2!=0)
            {
                minsquare=minsquare*i;
            }
            i=i+2;
        }
        return minsquare;
    }
    public static int arraylcm(int arr[],int n)
    {
        if(n<1)
        {
            return 0;
        }
        int l=arr[0];
        for(int i=1;i<n;i++)
        {
            l=l*arr[i]/gcd(l,arr[i]);
        }
        return l;
    }
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
}