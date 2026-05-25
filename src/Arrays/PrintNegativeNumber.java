package Arrays;

import java.util.Scanner;

//print negative numbers from the array
public class PrintNegativeNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
