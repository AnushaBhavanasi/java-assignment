import java.util.Scanner;
import java.lang.String;
public class CheckVowel
{
   public static void main(String[] args)
   {
       String str;
       int m = 0,length;
       char c;
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter a string: ");
       str= scan.nextLine();
       length = str.length();
       str= str.toLowerCase();
       for (int count=0; count < length; count++)
       {
           c= str.charAt(m);
           System.out.print(c);
           if (c == 'a' || c== 'e' || c == 'i'|| c == 'o' || c == 'u') {
               System.out.print(":Vowel");
               System.out.println();
           }
           else
           {
               System.out.print(":Consonant");
           }
           m++;
       }

   }
}