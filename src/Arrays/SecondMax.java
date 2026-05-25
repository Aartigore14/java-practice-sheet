package Arrays;

public class SecondMax {
    static void main() {
        int[] arr = {1,3,4,5,5,7,8};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max) max = arr[i] ;
        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > smax && arr[i] != max) smax = arr[i];
            }
        System.out.println("Second maximim element in array is "+smax);
        }
    }
