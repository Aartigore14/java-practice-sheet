package loops;

import java.util.Scanner;

//print ASCII values of all alphabests with their correspondin value
public class printAsciiValues {
    static void main() {
        for (int i = 65; i <90 ; i++) {
            System.out.println((char)i+" "+i);
        }
    }
}
