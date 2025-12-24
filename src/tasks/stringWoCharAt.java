package tasks;

import java.util.Scanner;

public class stringWoCharAt {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = data.next();

        System.out.print("Enter the index: ");
        short index = data.nextShort();

        char charArr[] = str.toCharArray();
        System.out.println("The character at index " + index + " is " + charArr[index]);
    }
}
