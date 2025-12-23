package tasks;

import java.util.Scanner;

public class stringMatching {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the String1: ");
        String str1 = data.next();

        System.out.println("Enter the String2: ");
        String str2 = data.next();



        if (str1.equals(str2) == true) {
            System.out.println("String are matching..");
        } else {
            System.out.println("Not matching..");
        }

    }
}
