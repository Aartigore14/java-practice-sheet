package PatternPrinting;
import java.sql.SQLOutput;
import java.util.Scanner;
public class StarRectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of row:");
        int rows = sc.nextInt();
        System.out.print("enter no. of col:");
        int col = sc.nextInt();

        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=col ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
