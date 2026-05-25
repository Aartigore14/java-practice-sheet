package loops;

import java.util.Scanner;

public class sum_reverse {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        int r = 0;
        while (n!=0){
            sum+= (n%10);
            n/=10;
            r*=10;
            r += (n%10);
            n/=10;
        }
        System.out.println("Sum is "+sum);
        System.out.println("Reverse number is "+r);
    }
}
