package basics;
import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // 1. Lookup the remote reference casted to the interface type
            Adder stub = (Adder) Naming.lookup("rmi://localhost/AdderService");

            // 2. Define input variables for addition
            double a = 45.5;
            double b = 24.5;
            System.out.println("Client: Requesting addition of " + a + " and " + b);

            // 3. Invoke the remote method
            double result = stub.add(a, b);

            // 4. Print the final result returned from the server
            System.out.println("Client: Result received from server = " + result);

        } catch (Exception e) {
            System.err.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
