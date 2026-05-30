package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayAddition {
    public void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array 1 size: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter elements for array 1: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter array 2 size: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter elements for array 2: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        int i = n1 - 1;
        int j = n2 - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += arr1[i];
                i--;
            }

            if (j >= 0) {
                sum += arr2[j];
                j--;
            }
            ans.add(sum % 10);
            carry = sum / 10;
        }
        Collections.reverse(ans);
        System.out.println("Result after addition of Array 1 & 2: " + ans);
        sc.close();
    }
}