package Arrays;

import java.util.Scanner;
//Take an array and a "target" number from the user. Write a program to check if the target exists in the array. If it does, print its index; otherwise, print "-1".
public class TargetElement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element:");
        int target = sc.nextInt();
        boolean flag = false;
        //linear search algorithm
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Target element is present at index " + i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("-1");
        }
    }
}
