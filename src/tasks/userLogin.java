package tasks;

import java.util.Scanner;

public class userLogin {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Do you have Account? Choose(true/false): ");
        boolean account = data.nextBoolean();
        if (account == true) {
            System.out.print("Do you know Username: ");
            boolean username = data.nextBoolean();
            System.out.print("Do you know Password: ");
            boolean pass = data.nextBoolean();
            if (username && pass == true) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Login failed!");
            }
        } else {
            System.out.println("Create an account");
        }
        data.close();
    }
}
