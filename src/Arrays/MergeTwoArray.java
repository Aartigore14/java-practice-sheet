package Arrays;
//program for 2 unsorted arrays that merge into one sorted array
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array 1 size: ");
        int n1Size = sc.nextInt();
        int[] arr1 = new int[n1Size];
        System.out.print("Enter elements for array 1: ");
        for (int i = 0; i < n1Size; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter array 2 size: ");
        int n2Size = sc.nextInt();
        int[] arr2 = new int[n2Size];
        System.out.print("Enter elements for array 2: ");
        for (int i = 0; i < n2Size; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[arr1.length + arr2.length];

        merge(arr3, arr1, arr2);

        Arrays.sort(arr3);

        System.out.print("Sorted Merged Array: ");
        for (int ele : arr3) {
            System.out.print(ele + " ");
        }
        System.out.println();

        sc.close();
    }

    public static void merge(int[] arr3, int[] arr1, int[] arr2) {
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[k++] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[k++] = arr2[j];
        }
    }
}