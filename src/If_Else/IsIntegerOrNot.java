package If_Else;
//take a real number and print number is integer or not
import java.util.Scanner;
public class IsIntegerOrNot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        double n =  sc.nextDouble();
        int x = (int)n;;
        if(x-n ==0){
            System.out.println("Number is Integer");
        }else{
            System.out.println("Number is not Integer");
        }
    }
}
