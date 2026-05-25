package Arrays;

import java.util.Scanner;

//print sum of elements of array
public class SumOfArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array:");
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n ; i++) {
            sum += arr[i];
        }
        System.out.println("sum is:"+sum);
    }
}
