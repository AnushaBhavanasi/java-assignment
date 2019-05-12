import java.util.Scanner;

public class Palindrome {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        int r,temp,rev=0,sum=0;
        System.out.println("enter the number");
        n=s.nextInt();
        temp=n;
        while(n!=0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        while(n!=0)
        {
            r=n%10;
            if(r%2==0)
            {
                sum=sum+r;
            }
            n=n/10;
        }
        if(temp==rev)
        {
            if(sum>25)
            {
                System.out.println("the number is palindrome and greater than 25");
            }
            else if(sum==25)
            {
                System.out.println("the number is palindrome and equal to 25");
            }
            else
            {
                System.out.println("the number is palindrome and less than 25");
            }
        }
        else
        {
            System.out.println("the number is not palindrome");
        }
    }
}
