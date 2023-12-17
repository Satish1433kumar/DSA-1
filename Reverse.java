import java.util.*;
public class Reverse{
    public static int reverse(int n){
        int rev=0;
        int r;
        while(n>0){
            r=n%10;
            rev=(rev*10)+r;
            n/=10;
        }
        return rev;
        }
        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number : ");
            int n=sc.nextInt();
            
            int s=reverse(n);
            System.out.println("The reverse of a given number is : "+s);
            sc.close();
    }
}