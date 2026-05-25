package If_Else;
//the the entered number is 4 digit number or not
import java.util.Scanner;
public class CheckFourDigitNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number");
        int n = sc.nextInt();
        if (n>999 && n<10000){
            System.out.println("4 digit number");
        }else{
            System.out.println("Not 4 digit number");
        }
    }
}
