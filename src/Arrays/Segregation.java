package Arrays;

public class Segregation {
    static void segrigate(int []arr){
        int NoOfZeros = 0;
        int NoOfOnes = 0;
        for (int ele : arr){
            if (ele==0) NoOfZeros++;
            else NoOfOnes++;
        }
        for (int i = 0; i < NoOfZeros ; i++) {
            arr[i]=0;
        }
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=1;
        }
    }
}
