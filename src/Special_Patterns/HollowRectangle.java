package Special_Patterns;

public class HollowRectangle {
    static void main() {
        int rows = 4;
        int columns = 7;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1||i==rows||j==1 || j == columns) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
