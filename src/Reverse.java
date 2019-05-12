import java.util.Scanner;

public class Reverse {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str,str1="";
        System.out.println("enter the string");
        str=s.next();
        for(int i=str.length()-1;i>=0;--i)
        {
            str1 +=str.charAt(i);
        }
        System.out.println(str1);
    }
}
