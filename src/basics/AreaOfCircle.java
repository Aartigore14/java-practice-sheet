package basics;

import java.util.Scanner;

public class AreaOfCircle {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a value:");
        double radius= sc.nextDouble();
        double area=3.14*radius*radius;
        System.out.println("Area of circle is "+area);
    }
}
