package Arrays;
import java.util.Arrays;
public class ShallowCopyDeepCopy {
    static void main() {
        int [] arr = {10,20,30,40};
        int [] x = arr;//x is the shallow copy of arr
        x[0] = 100;

        int [] arr2 = {12,23,34,45,56};
        int []y = Arrays.copyOf(arr2,arr2.length);//deep copy
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr2[0]);
    }
}
