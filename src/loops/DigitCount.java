package loops;

import java.util.Scanner;

//count digits of a number
public class DigitCount {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int count = 0;

        while (n!=0){
            n /= 10;
            count++;
        }
        System.out.println("count is "+count);
    }
}
