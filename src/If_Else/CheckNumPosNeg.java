//check a number that is even ,odd or negative
package If_Else;
import java.util.Scanner;
public class CheckNumPosNeg {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
            if (n <=0) {
                System.out.println("negative number");
            } else {
                if (n % 2 == 0) {
                    System.out.println("even number");
            }else{
                    System.out.println("odd number");
                }
        }
    }
}
