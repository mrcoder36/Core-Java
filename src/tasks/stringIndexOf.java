package tasks;

import java.util.Scanner;

public class stringIndexOf {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String name = data.next();

        System.out.print("Enter the Character: ");
        char letter = data.next().charAt(0);

        System.out.println("char at " + name.indexOf(letter));

    }
}
