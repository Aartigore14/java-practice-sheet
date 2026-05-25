package loops;

import java.util.Scanner;

//display this GP - 1,2,4,8..upto n terms
public class GeometricProgression {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        int a = 1;
        int b = 2;
        for (int i=1;i<=n;i++){
            System.out.println(a);
            a*=b;
        }
    }
}
