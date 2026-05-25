package If_Else;
//take a positive integer input and tell if it is odd or even
import java.util.Scanner;
public class Even_Odd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println(n+" is even number");
        }else{
            System.out.println(n+" is odd number");
        }
    }
}
