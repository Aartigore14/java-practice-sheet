package basics;
import java.util.Scanner;
//print sum of
public class SumOfNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z= sc.nextInt();
        int sum = x+y+z;
        System.out.println("sum is "+sum);
    }
}
