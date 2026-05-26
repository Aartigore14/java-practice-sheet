package Arrays;
//Write a program to calculate and print the sum and average of all elements in a given floating-point (double) array.
import java.util.Scanner;
public class SumAvg_Array {
    static void main() {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter size of array:");
        int n = sc.nextInt();
        double[] arr = new double[n];
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        //for sum of arrray
        double sum=0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avg = sum / n;
        System.out.println("Sum of array is:"+sum);
        System.out.println("Average of array is:"+avg);
    }
}
