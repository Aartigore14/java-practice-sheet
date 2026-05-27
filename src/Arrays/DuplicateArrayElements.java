package Arrays;
//Write a program to find and print all the duplicate elements in an integer array.
import java.util.Scanner;

public class DuplicateArrayElements {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isDuplicate = false;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate){
                break;
            }
        }
        if(isDuplicate){
            System.out.println("Array has duplicate elements");
        }
        else{
            System.out.println("No duplicate elements in the array");
        }
    }
}
