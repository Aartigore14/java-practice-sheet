package Arrays;

import java.util.Scanner;

public class LinearSearch {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int[] arr = {12,34,43,23,3,5,6,76,56};
        int target = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == target) {
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("target exists in array");
        else System.out.println("target missing in array");
    }
}
