package RMI_Apllication;
import java.net.*;
public class IPAddress {
    static void main() throws Exception {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("Host Name: "+local.getHostName());
        System.out.println("IP Address:"+local.getHostAddress());
    }
}
