package Arrays;

import java.util.Arrays;

public class RotateArray {
    static void rotatearr(int[]arr,int d){
        int n = arr.length;
        d%=n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int[]arr,int i,int j){
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void main() {
        int[]arr = {1,2,3,4,5,6,7,8};
        int d=3;
        rotatearr(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}
