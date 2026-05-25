package loops;

import java.util.Scanner;

//check a number if it is prime or not
public class PrimeNumber {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if ((n&i)==0){
                flag = false;
                break;
            }
        }
        if (n == 1) {
            System.out.println("Neither prime nor composite");
        } else if (flag==false) {
            System.out.println("Composite Number");
        }else{
            System.out.println("Prime number");
        }
    }
}
