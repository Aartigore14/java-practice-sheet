package PatternPrinting;

public class LowercaseAlphabetSquare {
    static void main() {
        int n= 4;
        for(int i = 1; i<=n;i++){
            for (int j = 1;j<=n;j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
