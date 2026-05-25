
//given a point(x,y),WAP to find out if it is lies in the 1st,2nd,3rd,4th quadrant,on the x-axis,y-axis or at the origin
package If_Else;
import java.util.Scanner;
public class CheckOriginOfPoint {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a x-coordinate: ");
        int x = sc.nextInt();
        System.out.print("enter a y-coordinate: ");
        int y = sc.nextInt();
        if(x>0 && y>0){
            System.out.println("1st quadrant");
        } else if (x<0 && y>0) {
            System.out.println("2nd quadrant");
        } else if (x<0 && y<0) {
            System.out.println("3rd quadrant");
        } else if (x>0 && y<0) {
            System.out.println("4th quadrant");
        } else if (x==0) {
            System.out.println("x-axis");
        } else if (y==0) {
            System.out.println("y-axis");
        } else{
            System.out.println("lies at the origin");
        }
    }
}
