package tasks;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = data.next();
        vowel(str);


        data.close();
    }

    static void vowel(String str) {

        if (str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u") || str.contains("A") || str.contains("E") || str.contains("I") || str.contains("O") || str.contains("U") ) {
            System.out.println("The string contains vowel...");
        } else {
            System.out.println("The string not contain vowel...");
        }
    }
}
