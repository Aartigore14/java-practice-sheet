package loops;
//take a input from user and print n numbers
import java.util.Scanner;
public class PrintNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        for (int i=1; i<=n;i++){
            System.out.println(i);
        }
    }
}
