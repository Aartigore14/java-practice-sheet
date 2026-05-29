package RMI_Apllication;
import java.rmi.*;

public interface PalindromeRemote extends Remote {
    boolean isPalindrome(String s) throws RemoteException;
}
