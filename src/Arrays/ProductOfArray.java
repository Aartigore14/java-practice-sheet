package Arrays;

import java.util.Scanner;

public class ProductOfArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array:");
        int n = sc.nextInt();
        int product = 1;
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n ; i++) {
            product *= arr[i];
        }
        System.out.println(" Product of array is:"+product);
    }
}
