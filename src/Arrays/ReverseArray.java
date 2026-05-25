package Arrays;
//reversin array using while loop
public class ReverseArray {
    static void main() {
        int[] arr = {34,5,67,7,34,23};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
