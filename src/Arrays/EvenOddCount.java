package Arrays;
//Given an array of integers, count and display the total number of even numbers and odd numbers present
import java.util.Scanner;

public class EvenOddCount {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("The count of Even elements in array: " + evenCount);
        System.out.println("The count of Odd elements in array: " + oddCount);
    }
}
