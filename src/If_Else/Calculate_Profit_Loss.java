package If_Else;
import java.util.Scanner;
public class Calculate_Profit_Loss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price:");
        int cp = sc.nextInt();
        System.out.print("Enter selling price:");
        int sp = sc.nextInt();
        if (cp<sp){
            System.out.println("Profit is "+((sp-cp)/cp*100)+"%");
        } else if (cp>sp) {
            System.out.println("Loss is "+((cp-sp)/cp*100)+"%");
        }else {
            System.out.println("No profit no loss!!");
        }
    }
    }
