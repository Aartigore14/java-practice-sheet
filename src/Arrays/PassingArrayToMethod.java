package Arrays;

public class PassingArrayToMethod {
    static void main() {
        int [] x = {2,34,56,23,7};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int []x){
        x[2] = 99;
    }
}
