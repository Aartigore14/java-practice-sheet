package If_Else;
//take integer input and print absolute value of that integer
import java.util.Scanner;
public class AbsoluteNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =  sc.nextInt();
        if (n>=0){
            System.out.println(n);
        } else {
            System.out.println(-n);
        }
    }
}
