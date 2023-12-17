import java.util.*;
public class NumberCounting {
    public static int noOfDigits(int n)
    {
        int count = 0;
        while(n!=0)
        {
           n/=10;
           count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        
        int s=noOfDigits(n);
        System.out.println("No of digits is : "+s);
        sc.close();
    }
   

}
