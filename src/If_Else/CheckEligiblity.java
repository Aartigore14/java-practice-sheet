//take age and gender and check if it is eligible for genral scholarship or women's scholarship
package If_Else;
import java.lang.String;
import java.util.Scanner;
public class CheckEligiblity {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter age:");
        int age = sc.nextInt();
        System.out.print("enter gender:");
        String gender = sc.next();
        if (age>=18){
            if(gender.equalsIgnoreCase("female")){
                System.out.println("eligible for women's scholarship");
            }else {
                System.out.println("eligible for general Scholarship");
            }
        }else {
            System.out.println("not eligible");
        }

    }
}
