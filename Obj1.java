package Objective;

import java.net.*;
import java.util.Scanner;

public class Obj1 {
    public static void main(String[] args) {
        try {
            System.out.print("Enter the website name: ");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            InetAddress ip = InetAddress.getByName(name);
            System.out.println("IP address of " + name + " is " + ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Website not found");
        }
    }
}