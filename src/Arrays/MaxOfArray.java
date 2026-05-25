package Arrays;

import java.util.Scanner;

//print the maximum element in the array
public class MaxOfArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = arr[0];
        System.out.print("Enter array elements:");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if (arr[i]>max) max = arr[i];
        }
        System.out.println("Maximum element in array:"+max);
    }
}
