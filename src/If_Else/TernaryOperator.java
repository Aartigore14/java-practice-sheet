package If_Else;
//print even or odd number using ternary operator
import java.util.Scanner;
public class TernaryOperator {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n =  sc.nextInt();
        System.out.println((n%2==0) ? "Even Number" : "Odd number");
    }
}
