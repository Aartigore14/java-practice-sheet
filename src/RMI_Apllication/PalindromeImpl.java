package RMI_Apllication;
import java.rmi.*;
import java.rmi.server.*;

public class PalindromeImpl extends UnicastRemoteObject
        implements PalindromeRemote {
    public PalindromeImpl() throws RemoteException {}

    public boolean isPalindrome(String s) throws RemoteException {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(rev);
    }
}