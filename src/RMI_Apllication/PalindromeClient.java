package RMI_Apllication;
import java.rmi.*;
import java.util.Scanner;

public class PalindromeClient {
    public static void main(String[] args) throws Exception {
        PalindromeRemote obj = (PalindromeRemote)
                Naming.lookup("rmi://localhost/PalindromeService");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String or number to check palindrome: ");
        String input = sc.nextLine();
        boolean result = obj.isPalindrome(input);

        if (result)
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is not a Palindrome");

        sc.close();
    }
}
