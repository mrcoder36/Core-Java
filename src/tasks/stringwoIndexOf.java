package tasks;

import java.util.Scanner;

public class stringwoIndexOf {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String name = data.next();

        System.out.print("Enter the Character: ");
        char letter = data.next().charAt(0);


        int index = 0;
        for (int i = 0; i < name.length(); i++) {
            if (letter == name.charAt(i)) {
                index = i;
            }
            
        }
        System.out.println("Character at " + index);
        data.close();
    }
}
