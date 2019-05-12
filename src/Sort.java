import java.util.Scanner;
public class Sort
{
    public static void main(String[] args) {
        int n, temp, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(arr[n - 1]);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }

        }
        if(sum>15){
            System.out.println("sum of even numbers : " +sum);
            System.out.println("True");
        }
        else{
            System.out.println("sum of even numbers : " +sum);
            System.out.println("False");
        }

    }


}
