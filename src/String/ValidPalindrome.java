package String;
import java.util.Scanner;

public class ValidPalindrome {
    public void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String s = sc.nextLine();

        boolean isPalindrome = checkPalindrome(s);
        System.out.println("Is it a valid palindrome? " + isPalindrome);
    }

    public static boolean checkPalindrome(String s) {
        int leftSide = 0;
        int rightSide = s.length() - 1;

        while (leftSide < rightSide) {
            if (!Character.isLetterOrDigit(s.charAt(leftSide))) {
                leftSide++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(rightSide))) {
                rightSide--;
            }
            else {
                char leftChar = Character.toLowerCase(s.charAt(leftSide));
                char rightChar = Character.toLowerCase(s.charAt(rightSide));

                if (leftChar != rightChar) {
                    return false; // Mismatch found
                }

                leftSide++;
                rightSide--;
            }
        }
        return true;
    }
}
