package PatternPrinting;

import java.util.Scanner;

public class SameAlphabetSquare {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i%2==0) {
                    System.out.print((char) ('a' + i) + " ");
                } else {
                    System.out.print((char) ('A' + i) + " ");
                }
            }
            System.out.println();
        }
    }
}
