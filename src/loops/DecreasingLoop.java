package loops;
//print n to 1 numbers
import java.util.Scanner;
public class DecreasingLoop {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= sc.nextInt();
        for (int i = n; i >=1 ; i--) {
            System.out.println(i);
        }
    }
}
