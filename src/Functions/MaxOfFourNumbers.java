package Functions;

import java.util.Scanner;

public class MaxOfFourNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));
    }
}
