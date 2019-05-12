import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AlphabetCheck{
    public static void main(String args[]) throws IOException {
        char ch;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any character:");
        ch = (char) bf.read();
        if(ch >= 'a' && ch<= 'z') {
            System.out.println("Lower Case"); }

        else if(ch >= 'A' && ch<= 'Z') {
            System.out.println("Upper case");

        } else if (ch >= '0' && ch<='9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}