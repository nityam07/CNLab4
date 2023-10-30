package Objective;

import java.net.*;
import java.util.Scanner;

//ipVersionCheck

public class Obj3 {
    public static void main(String[] args) {
    	 System.out.print("Enter the IP: ");
         Scanner sc = new Scanner(System.in);
         String name = sc.nextLine();
    	try {
            InetAddress address = InetAddress.getByName(name);
            if (address instanceof Inet6Address) {
                System.out.println("IPv6");
            } else if (address instanceof Inet4Address) {
                System.out.println("IPv4");
            }
        } catch (Exception e) {
            System.out.println("Some Error Occurred");
        }
    }
}
