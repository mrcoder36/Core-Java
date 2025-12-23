package tasks;

import java.util.Scanner;

public class stringIspresent {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String name = data.next();

        System.out.print("Enter the Character: ");
        String letter = data.next();

        boolean ispresent = name.contains(letter);

        if (ispresent == true) {
            System.out.println("Character is present...");
        } else {
            System.out.println("Character not present...");
        }
        data.close();
    }
}
