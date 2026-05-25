package If_Else;
import java.util.Scanner;
public class CheckMagnitude {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number");
        int num = sc.nextInt();
        int mag = -num;
        if(num<0){
            mag= -num;
        } else{
            mag = num;
        }
        if(mag<69){
            System.out.println("magnitude is smaller than 69");
        }else{
            System.out.println("magnitude is not smaller than 69");
        }
    }
}
