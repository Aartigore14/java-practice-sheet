package Arrays;

import java.util.Arrays;

//multiply odd indexed elements by 2 and add 10 to even indexed elements
public class OddEvenArray {
    static void main() {
        int []arr = {3,4,5,7,8,9,12};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                arr[i]+=10;//even index
            } else{
                arr[i]*=2;//odd index
            }
            System.out.print(arr[i]+" ");
        }
    }
}
