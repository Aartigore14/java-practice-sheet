package PatternPrinting;

import java.util.Scanner;

public class AlphabetSquare {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i + 64) + " ");//typecasting int to char(Ascii values )
            }
            System.out.println();
        }
    }
}


