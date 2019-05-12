import java.util.Scanner;

public class RepeatString {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str,str1="",str2="";
        int n;
        System.out.println("enter the string ");
        str=s.next();
        System.out.println("enter the number to repeat");
        n=s.nextInt();
        for(int i=str.length()-1;i>n;i--)
        {
            str1+=str.charAt(i);
        }
        for(int i=str1.length()-1;i>=0;i--)
        {
            str2+=str1.charAt(i);
        }
        while(n!=0)
        {
            str+=str2;
            --n;

        }
        System.out.println(str);
    }
}
