package Functions;

import java.util.Scanner;

public class CombinationAndPermutation {
    public static int fact(int x){
        int f = 1;
        for (int i = 1; i <=x ; i++) {
            f*=i;
        }
        return f;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nCr = fact(n)/fact(r)*fact(n-r);
        int nPr = fact(n)/fact(n-r);
        System.out.println("nCr="+nCr);
        System.out.println("nPr="+nPr);
    }
}
