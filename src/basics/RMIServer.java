package basics;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // 1. Programmatically start the RMI registry on default port 1099
            LocateRegistry.createRegistry(1099);
            System.out.println("RMI Registry started on port 1099.");

            // 2. Create an instance of the remote object implementation
            AdderImpl adderService = new AdderImpl();

            // 3. Bind the remote object instance to a lookup name URL
            Naming.rebind("rmi://localhost/AdderService", adderService);

            System.out.println("Adder RMI Server is running and ready.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}