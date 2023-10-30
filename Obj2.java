package Objective;
import java.net.*;

public class Obj2 {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("IP address of the local machine is " + ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("IP address of the local machine could not be determined");
        }
    }
}