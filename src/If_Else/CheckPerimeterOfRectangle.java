//take length and breadth of a rectangle as input and WAP to check whether the area of rectangle is greater than its perimeter
package If_Else;
import java.util.Scanner;
public class CheckPerimeterOfRectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle:");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("Area of Rectangle is "+area);
        int perimeter = 2*(length + breadth);
        System.out.println("Perimeter of Rectangle is "+perimeter);
        if(area>perimeter){
            System.out.println("Area of rectangle is greater than its perimeter");
        }else{
            System.out.println("Area of rectangle is not greater than its perimeter");
        }
    }
}
