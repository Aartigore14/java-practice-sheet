package loops;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <=n; i++) {
            fact *= i;
        }
        System.out.println("Factorial is "+fact);
    }
}
