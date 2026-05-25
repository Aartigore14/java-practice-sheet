package If_Else;
//take a positive integer input and tell if it is divisible by 5
import java.util.Scanner;
public class NumberDivision {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        if (n%5==0){
            System.out.println(n+" is divisible by 5.");
    } else {
            System.out.println(n+" is not divisible by 5.");
        }
    }
}
