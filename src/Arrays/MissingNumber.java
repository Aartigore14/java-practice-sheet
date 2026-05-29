package Arrays;

import java.util.Scanner;
//find the missing number in the array

public class MissingNumber {
    static void main() {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int expectedSum= (n*(n+1))/2;
        int actualSum = 0;
        for(int num : arr){
            actualSum +=num;
        }
        int missingNum = expectedSum - actualSum;
        System.out.println("Missing element in array is: "+missingNum);
    }
}
