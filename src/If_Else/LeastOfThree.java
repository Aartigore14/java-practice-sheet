package If_Else;
//using if else ladder
import java.util.Scanner;
public class LeastOfThree {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 1st Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 1st Number: ");
        int c = sc.nextInt();
        if (a<b){
            System.out.println(a);
            if (a<c){
                System.out.println(c);
            }
        }else{
            if (b<c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }

        }
        }
    }