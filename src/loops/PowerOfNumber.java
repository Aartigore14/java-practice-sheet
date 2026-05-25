package loops;

import java.util.Scanner;

//calculate a raised to power b
public class PowerOfNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int a = sc.nextInt();
        System.out.print("Enter number:");
        int b = sc.nextInt();
        int pow=1;

        for (int i = 1; i <b ; i++) {
            pow *=b;
        }
        System.out.println(a+" raised to the power "+b+" is "+pow);
    }
}
