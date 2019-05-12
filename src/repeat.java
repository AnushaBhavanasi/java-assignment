import java.util.Scanner;

public class repeat {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter the number of lines");
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
        }
    }
}
