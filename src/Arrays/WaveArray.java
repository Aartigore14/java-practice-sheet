package Arrays;

import java.util.Arrays;

public class WaveArray {
    public void sortArray(int[]arr){
        int n = arr.length;
        for (int i = 0;i<arr.length-1;i+=2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    static void main() {
        int[] arr = {2,5,4,6,7,8};
        WaveArray obj = new WaveArray();
        obj.sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
