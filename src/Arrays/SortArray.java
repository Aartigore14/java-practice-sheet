package Arrays;

import java.util.Scanner;

//Write a boolean function isSorted(int[] arr) that returns true if the array is sorted in ascending order, and false otherwise.
public class SortArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                System.out.println("false-Array is not sorted");
                break;
            }
        }
        if (isSorted) {
            System.out.println("true-Array is sorted");
        }
    }
}
