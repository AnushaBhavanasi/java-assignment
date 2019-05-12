import java.util.Scanner;

public class FindNumber {
    static String findNumber(int n) {
        int i=20;
        if (n % 2 != 0) {
            while (i <= 30) {
                if (i == n) {
                   return "tom";
                }
                i++;
            }
        }
        else
           return "jerry";


        return null;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n=s.nextInt();
        System.out.println(findNumber(n));
    }
}
