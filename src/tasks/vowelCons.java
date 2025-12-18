package tasks;

import java.util.Scanner;

public class vowelCons {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner data = new Scanner(System.in);
        char ch = data.next().charAt(0);

        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
            System.out.println("The Character is Vowel");
        } else {
            System.out.println("The Character is Consonant");
        }

    }
}
