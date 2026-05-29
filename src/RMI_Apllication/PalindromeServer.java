package RMI_Apllication;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class PalindromeServer {
    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099); // starts registry automatically
        PalindromeImpl obj = new PalindromeImpl();
        Naming.rebind("rmi://localhost/PalindromeService", obj);
        System.out.println("Server is running... waiting for client.");
    }
}