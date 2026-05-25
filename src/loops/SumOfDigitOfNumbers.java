package loops;

import java.util.Scanner;

//print sum of digits of a number
public class SumOfDigitOfNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int sum = 0;

        while (n!=0){
            sum+= (n%10);
            n/=10;
        }
        System.out.println("sum is "+sum);
    }
}
