package Arrays;

import java.util.Scanner;
public class MinOfArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = arr[0];
        System.out.print("Enter array elements:");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if (arr[i]<min) min = arr[i];
        }
        System.out.println("Minimum element in array:"+min);
    }
}
