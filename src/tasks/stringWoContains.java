package tasks;

import java.util.Scanner;

public class stringWoContains {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = data.next();

        System.out.print("Enter the character: ");
        char ch = data.next().charAt(0);

        char charArr[] = str.toCharArray();
        boolean isPresent = false;

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == ch) {
                isPresent = true;
            }
        }

        if (isPresent == true) {
            System.out.println("The character is present...");
        } else {
            System.out.println("The character is not present..");
        }
        data.close();
    }

}
