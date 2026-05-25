package basics;

import java.util.Scanner;

public class Swapping {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int a = sc.nextInt();
        System.out.print("enter number:");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swapped number:");
    }
}
