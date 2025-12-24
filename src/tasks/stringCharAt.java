package tasks;

import java.util.Scanner;

public class stringCharAt {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = data.next();

        System.out.print("Enter the Character: ");
        char ch = data.next().charAt(0);

        int index = str.indexOf(ch);

        if (index != -1) {
            System.out.println("The character '" + ch + "' is found at index: " + index);
        } else {
            System.out.println("The character '" + ch + "' is not present in the string.");
        }
    }
}
