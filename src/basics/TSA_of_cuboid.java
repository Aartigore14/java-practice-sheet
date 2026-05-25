package basics;
//calculate total surface area of cuboid
public class TSA_of_cuboid {
    static void main() {
        int length=3;
        int width=4;
        int height=5;
        int area=2*(length*width+width*height+length*height);
        System.out.println("The total surface area of cuboid is "+area);
    }
}
