package loops;
import java.util.Scanner;
public class LoopQuestions {
    static void main() {

        //print numbers from 1 to 50
        for (int i = 1; i <=50 ; i++) {
            System.out.print(i+" ");
        }

        //print numbers from 50 to 1
        int i = 50;
        while (i>=1){
            System.out.print(i+" ");
            i--;
        }

        //print all even nos bet 1 to 100
        for (int j = 1; j <=100 ; j++) {
            if (j % 2 == 0){
                System.out.print(j+" ");
            }
        }

        //print all odd numbers between 1 to 100
        for (int j = 0; j <=100 ; j++) {
            if (j%2==1){
                System.out.print(j+" ");
            }
        }
        //print multiplication table of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        for (int j = 1; j <=10; j++) {
            System.out.println((n*j)+" ");
        }
    }
}
