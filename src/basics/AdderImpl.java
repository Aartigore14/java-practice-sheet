package basics;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderImpl extends UnicastRemoteObject implements Adder {

    // Constructor must throw RemoteException because parent constructor does
    public AdderImpl() throws RemoteException {
        super();
    }

    @Override
    public double add(double num1, double num2) throws RemoteException {
        System.out.println("Server Log: Received request to add " + num1 + " and " + num2);
        return num1 + num2;
    }
}
