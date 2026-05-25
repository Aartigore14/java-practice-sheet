package basics;
//print square of any number
import java.util.Scanner;

public class SquareOfNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num= sc.nextInt();
        int square = num*num;
        System.out.println("Square of a given number is "+square);
    }
}
