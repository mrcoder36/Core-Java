package tasks;

import java.util.Scanner;

public class alphaDigit {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner data = new Scanner(System.in);
        char ch = data.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("The Character is Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("The Character is Digit");
        } else {
            System.out.println("The Character is Special");
        }
    }
}
