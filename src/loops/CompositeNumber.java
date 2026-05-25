package loops;
//Check a number  is composite or not
import java.util.Scanner;
public class CompositeNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                System.out.println("Composite Number");
                break;
            }
        }
    }
}
