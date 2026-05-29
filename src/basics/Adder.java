package basics;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Adder extends Remote {
    // Remote method declaration for adding two numbers
    public double add(double num1, double num2) throws RemoteException;
}
