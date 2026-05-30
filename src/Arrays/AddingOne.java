package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Given a non-negative integer(without leading zeroes) represented as an array arr. Your task is to add 1 to the number (increment the number by 1). The digits are stored such that the most significant digit is at the starting index of the array.
public class AddingOne {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] + carry <= 9) {
                ans.add(arr[i] + carry);
                carry = 0;
            } else {//arr[i]+carry=10
                ans.add(0);
                carry = 1;
            }
        }
        if (carry == 1){
            ans.add(1);
        }
        Collections.reverse(ans);
        System.out.println("Result after adding 1:" + ans);
    }
}
