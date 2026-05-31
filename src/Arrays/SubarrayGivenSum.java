package Arrays;

import java.util.Scanner;

public class SubarrayGivenSum {
    public static int[] findSubarray(int[]arr,int targetSum){
        int currentSum=0;
        int start=0;
        for (int end = 0; end < arr.length ; end++) {
            currentSum+=arr[end];

            while (currentSum > targetSum && start<end){
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == targetSum){
                return new int[]{start,end};
            }
        }
        return new int[]{-1,-1};
    }

    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[]arr = new int[n];

        System.out.print("enter "+n+" integer numbers: ");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum (S): ");
        int target = sc.nextInt();

        int []result = findSubarray(arr,target);
        if (result[0]!= -1){
            System.out.println("subarray found between 0-based indices: "+result[0]+" and "+result[1]);
            System.out.print("Subarray elements:");
            for (int i = result[0]; i <=result[1] ; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }else {
            System.out.println("No continuous subarray found with the given sum!!");
        }
    }
}




