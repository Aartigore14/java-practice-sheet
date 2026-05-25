//take 3 integers input  and print reatest number from them
package If_Else;
import java.util.Scanner;
public class CheckGreatestNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 1st Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 1st Number: ");
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println(a);
        }else if (b>=a && b>=c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
