package If_Else;
import java.util.Scanner;
public class CheckNumberDivision {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number:");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("Number is divisible by 5 and 3");
        } else if (n%5==0) {
            System.out.println("Number is divisible by 5");
        }else if (n%3==0){
            System.out.println("Number is divisible by 3");
        } else {
            System.out.println("Number is not divisible by 5 and 3");
        }
    }
}
