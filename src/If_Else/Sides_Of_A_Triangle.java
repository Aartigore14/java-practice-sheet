//Take 3 positive integer input and tell if they can be the sides of triangle or not
package If_Else;
import java.util.Scanner;
public class Sides_Of_A_Triangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side of triangle:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd side of triangle:");
        int b = sc.nextInt();
        System.out.print("Enter 3rd side of triangle:");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("It is a triangle");
        }else{
            System.out.println("It is not a triangle");
        }
    }
}
