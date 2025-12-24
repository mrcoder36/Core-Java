package tasks;

import java.util.Scanner;

public class stringLength {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = data.next();

        int count = 0;
        int i = 0;

        while (i < str.length()) {
            count++;
            i++;
        }
        System.out.println("The count is " + count);
        data.close();
    }
}
